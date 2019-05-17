package com.fwd.demo.routes;

import javax.xml.namespace.QName;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.component.jackson.ListJacksonDataFormat;
import org.apache.camel.dataformat.soap.SoapJaxbDataFormat;
import org.apache.camel.dataformat.soap.name.QNameStrategy;
import org.apache.camel.dataformat.soap.name.ServiceInterfaceStrategy;
import org.apache.camel.dataformat.soap.name.TypeNameStrategy;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.model.rest.RestBindingMode;

import com.fwd.demo.beans.request.InternalRequest;
import com.fwd.demo.beans.response.InternalResponse;

/**
 * 
 
 Internal Request
----------------
{
  "__type" : "InputFWDQuote:#FWD.GI.Common.Schema",
  "AppFrom" : "CustomerPortal",
  "Channel" : "Web",
  "Company" : "",
  "Lang" : "EN",
  "ProductName" : "TravelCare",
  "System" : "BrokerAPI",
  "UserID" : "HKXXXX",
  "Source" : "HKXXXX",
  "DataQuotation" : {
    "__type" : "DataQuotation:#FWD.GI.TravelCare.Schema",
    "DiscountParty" : {
      "__type" : "DiscountParty:#ING.GI.Product.Schema",
      "PromoteCode" : ""
    },
    "ChildCover" : false,
    "ChildInput" : 0,
    "CommencementDateStr" : "09/05/2019",
    "ExpiryDateStr" : "11/05/2019",
    "InsuredSummary" : {
      "__type" : "InsuredSummary:#FWD.GI.TravelCare.Schema"
    },
    "OtherInput" : 0,
    "Plan" : "A",
    "PlanB" : "B",
    "PlanBPriceInfo" : {
      "__type" : "PriceInfo:#ING.GI.Product.Schema"
    },
    "SelfCover" : true,
    "SpouseCover" : false
  }
}

Internal Response
------------------
{
  "systemError" : false,
  "IsSystemError" : false,
  "Result" : true,
  "Message" : {
    "ErrorAction" : [ ],
    "ErrorFlag" : false,
    "ErrorMessage" : [ ],
    "ErrorCode" : [ ],
    "InformationFlag" : false,
    "InformationMessage" : [ ],
    "WarningFlag" : false,
    "WarningMessage" : [ ]
  },
  "DataQuotation" : {
    "__type" : "DataQuotation:#FWD.GI.TravelCare.Schema",
    "BusinessSource" : 0,
    "DiscountParty" : {
      "__type" : "DiscountParty:#ING.GI.Product.Schema",
      "PromoteCode" : ""
    },
    "Intermediary" : {
      "__type" : "Intermediary:#ING.GI.Product.Schema",
      "Name" : "*XXX limited",
      "Code" : "HKXXXX"
    },
    "IsCommissionOverride" : false,
    "PolicyEndorsement" : 0,
    "PolicyRenewal" : 0,
    "PriceInfo" : {
      "__type" : "PriceInfo:#ING.GI.Product.Schema",
      "GrossPremium" : 145,
      "DirectDiscount" : 0,
      "DirectDAmount" : 0,
      "SaleDiscount" : 0,
      "SaleDAmount" : 0,
      "Commission" : 47.5,
      "CommissionAmount" : 68.88,
      "TotalDue" : 145.09,
      "AfterCoupon" : 0,
      "CommissionChange" : 47.5,
      "DirectDiscountChange" : 0,
      "GroupDAmount" : 0,
      "GroupDiscount" : 0,
      "GroupDiscountChange" : 0,
      "Levy" : 0,
      "LevyAmount" : 0,
      "NetPremium" : 76.210000000000008,
      "Tax" : 0,
      "TaxAmount" : 0,
      "CouponAmount" : 0,
      "InsuranceLevy" : {
        "LevyAmount" : 0.09,
        "LevyCap" : 3000.0,
        "LevyRate" : 0.0600,
        "LevyEffectiveDate" : "/Date(1554048000000+0800)/",
        "LevyEffectiveDateStr" : "01/04/2019"
      }
    },
    "RequestVer" : 0,
    "System" : "BrokerAPI",
    "TransactionStatus" : 0,
    "eWalletFlag" : false,
    "ApproveDateStr" : "",
    "ChildCover" : false,
    "ChildInput" : 0,
    "CommencementDateStr" : "09/05/2019",
    "Corporate" : false,
    "ExpiryDateStr" : "11/05/2019",
    "InsuredSummary" : {
      "__type" : "InsuredSummary:#FWD.GI.TravelCare.Schema",
      "ChildCount" : 0,
      "FamilyPlanBPremium" : 0,
      "FamilyPlanCount" : 0,
      "FamilyPlanPremium" : 0,
      "IndividualPlanBPremium" : 115,
      "IndividualPlanCount" : 1,
      "IndividualPlanPremium" : 145,
      "OtherCount" : 0,
      "SelfCount" : 1,
      "SpouseCount" : 0,
      "WithChildPlanBPremium" : 0,
      "WithChildPlanCount" : 0,
      "WithChildPlanPremium" : 0
    },
    "IssueDateStr" : "",
    "Noofday" : 3,
    "OtherInput" : 0,
    "Plan" : "A",
    "PlanB" : "B",
    "PlanBPriceInfo" : {
      "__type" : "PriceInfo:#ING.GI.Product.Schema",
      "AfterCoupon" : 0,
      "Commission" : 47.5,
      "CommissionAmount" : 54.63,
      "CommissionChange" : 47.5,
      "CouponAmount" : 0,
      "DirectDAmount" : 0,
      "DirectDiscount" : 0,
      "DirectDiscountChange" : 0,
      "GrossPremium" : 115,
      "GroupDAmount" : 0,
      "GroupDiscount" : 0,
      "GroupDiscountChange" : 0,
      "Levy" : 0,
      "LevyAmount" : 0,
      "NetPremium" : 60.439999999999991,
      "SaleDAmount" : 0,
      "SaleDiscount" : 0,
      "Tax" : 0,
      "TaxAmount" : 0,
      "TotalDue" : 115.07,
      "InsuranceLevy" : {
        "LevyAmount" : 0.07,
        "LevyCap" : 3000.0,
        "LevyRate" : 0.0600,
        "LevyEffectiveDate" : "/Date(1554048000000+0800)/",
        "LevyEffectiveDateStr" : "01/04/2019"
      }
    },
    "SelfCover" : true,
    "SpouseCover" : false,
    "TransactionDateStr" : ""
  }
}

 
 *
 */
public class MyWebServiceRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		    //ListJacksonDataFormat format = new ListJacksonDataFormat(); format.setAllowJmsType(true);
		    JacksonDataFormat format = new JacksonDataFormat(InternalRequest.class); format.setAllowJmsType(true);
		    JaxbDataFormat df = new JaxbDataFormat();
		    
		    //ServiceInterfaceStrategy strat =  new ServiceInterfaceStrategy(InternalRequest.class, true);
		    SoapJaxbDataFormat soapDataFormat = new SoapJaxbDataFormat(InternalRequest.class.getPackage().getName(),
		    		new QNameStrategy(new QName("http://demo.fwd.com","InternalRequest")) );
		  
		    df.setContextPath(InternalRequest.class.getPackage().getName());
		    
		    restConfiguration()
				.component("spark-rest")
					.port(18080)
			;
			rest("/publisher/name")
				.post().produces("text/xml").consumes("text/json")
				//.bindingMode(RestBindingMode.json)
				//.type(InternalRequest.class).outType(InternalResponse.class)
					.to("direct:get")
			;
			from("direct:get")
			    .unmarshal(format)
			    //.unmarshal(df)
			    .log("unmarshalled body: ${body}")
			    .log("Connecting to: ${sysenv.FWD_WEB_ENDPOINT}")
				.routeId("NameWSGet")
				//.marshal(format)
				.marshal(soapDataFormat)
				//.marshal(df)
				.log("marshalled body: ${body}")
				//.removeHeaders("CamelHttp*")
				//.setHeader(Exchange.HTTP_METHOD, simple("${sysenv.FWD_WEB_METHOD}"))
				//.toD("${sysenv.FWD_WEB_ENDPOINT}")
				//.choice()
				//	.when(header("CamelHttpResponseCode").isEqualTo("204"))
						.to("direct:error")
				//	.when(header("CamelHttpResponseCode").isEqualTo("200"))
				//		.to("direct:ok")
				.end()
			;
			
			from("direct:ok")
				.routeId("OK")
				//.convertBodyTo(String.class)
				//.setHeader("publisher_id", xpath("/publisher/@id", String.class))
				//.removeHeaders("CamelHttp*")
				//.setBody(constant("OK"))
				//.setHeader(Exchange.HTTP_METHOD, constant("GET"))
				//.enrich().simple("http://localhost:8080/bookstore/rest/pub/id/${header.publisher_id}/books").aggregationStrategy(new MyPublisherAggregate())
				//.log("ok")
			    .log("body: ${body}")

			;
			
			from("direct:error")
				//.routeId("ProcessError")
				//.setBody(constant("Publisher not found."))
				//.setHeader(Exchange.HTTP_RESPONSE_CODE, constant("404"))
				.log("Error")
			;
			
	}

}
