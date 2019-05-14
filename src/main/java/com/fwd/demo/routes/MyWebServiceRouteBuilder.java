package com.fwd.demo.routes;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

//import com.fwd.demo.beans.MyPublisherAggregate;

public class MyWebServiceRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
			restConfiguration()
				.component("spark-rest")
					.port(18080)
			;
			rest("/publisher/name")
				.post().produces("text/xml").consumes("text/json").bindingMode(RestBindingMode.auto)
					.to("direct:get")
			;
			from("direct:get")
			    .log("body: ${body}")
				.routeId("NameWSGet")
				.removeHeaders("CamelHttp*")
				//.setHeader(Exchange.HTTP_METHOD, constant("GET"))
				.toD("http://localhost:8081/")
				.choice()
					.when(header("CamelHttpResponseCode").isEqualTo("204"))
						.to("direct:error")
					.when(header("CamelHttpResponseCode").isEqualTo("200"))
						.to("direct:ok")
				.end()
			;
			
			from("direct:ok")
				.routeId("OK")
				.convertBodyTo(String.class)
				//.setHeader("publisher_id", xpath("/publisher/@id", String.class))
				.removeHeaders("CamelHttp*")
				//.setBody(constant("OK"))
				.setHeader(Exchange.HTTP_METHOD, constant("GET"))
				//.enrich().simple("http://localhost:8080/bookstore/rest/pub/id/${header.publisher_id}/books").aggregationStrategy(new MyPublisherAggregate())
				.log("ok")
			;
			
			from("direct:error")
				.routeId("ProcessError")
				.setBody(constant("Publisher not found."))
				.setHeader(Exchange.HTTP_RESPONSE_CODE, constant("404"))
				.log("Error")
			;
			
	}

}
