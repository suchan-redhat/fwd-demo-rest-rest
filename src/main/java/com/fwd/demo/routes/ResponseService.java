package com.fwd.demo.routes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.xml.namespace.QName;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.dataformat.soap.SoapJaxbDataFormat;
import org.apache.camel.dataformat.soap.name.QNameStrategy;
import org.apache.camel.dataformat.soap.name.ServiceInterfaceStrategy;
import org.apache.camel.dataformat.soap.name.TypeNameStrategy;
import org.apache.camel.http.common.HttpConfiguration;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.model.rest.RestBindingMode;

import com.fwd.demo.beans.response.DataQuotation;
import com.fwd.demo.beans.response.DiscountParty;
import com.fwd.demo.beans.response.Intermediary;
import com.fwd.demo.beans.response.InsuredSummary;
import com.fwd.demo.beans.request.InternalRequest;
import com.fwd.demo.beans.response.PlanBPriceInfo;
import com.fwd.demo.beans.response.InternalResponse;
import com.fwd.demo.beans.response.Message;
import com.fwd.demo.beans.response.PriceInfo;
import com.sun.xml.bind.v2.schemagen.xmlschema.List;


public class ResponseService {
	public static void main(String arg[])throws Exception{
		ResponseService responseService =new ResponseService();
		int test =responseService.dayCounting("09/05/2019","11/05/2019");
		System.out.println(test);
	}
	public InternalResponse requestToResponse(InternalRequest request){
		ResponseService responseService =new ResponseService();
		InternalResponse internalResponse = new InternalResponse();
		//set systemError, IsSystemError, Result 
		internalResponse.setSystemError(false);
		internalResponse.setIsSystemError(false);
		internalResponse.setResult(true);
		
		//set message
		Message message =new Message();		
		message.setErrorFlag(false);
		message.setInformationFlag(false);
		message.setWarningFlag(false);
		internalResponse.setMessage(message);
		
		//set DataQuotation
		DataQuotation dataQuotation = new DataQuotation();
		dataQuotation.setType(request.getType());
		dataQuotation.setBusinessSource(0);
		
		DiscountParty discountParty =new DiscountParty();
		discountParty.setType(request.getDataQuotation().getDiscountParty().getType());
		discountParty.setPromoteCode(request.getDataQuotation().getDiscountParty().getPromoteCode());		
		dataQuotation.setDiscountParty(discountParty);
		
		//set Intermediary
		Intermediary intermediary = new Intermediary();
		intermediary.setType(request.getDataQuotation().getInsuredSummary().getType());
		intermediary.setCode(request.getSource());
		//intermediary.setName("name");		
		dataQuotation.setIntermediary(intermediary);
		dataQuotation.setIsCommissionOverride(false);
		dataQuotation.setPolicyEndorsement(0);
		dataQuotation.setPolicyRenewal(0);
		
		//set PriceInfo
		PriceInfo priceinfo =new PriceInfo();
		priceinfo.setType(request.getDataQuotation().getInsuredSummary().getType());
		dataQuotation.setPriceInfo(priceinfo);
		dataQuotation.setRequestVer(0);
		dataQuotation.setSystem(request.getSystem());
		dataQuotation.setTransactionStatus(0);
		dataQuotation.setEWalletFlag(false);
		dataQuotation.setApproveDateStr("");
		dataQuotation.setChildCover(request.getDataQuotation().getChildCover());
		dataQuotation.setChildInput(request.getDataQuotation().getChildInput());
		dataQuotation.setCommencementDateStr(request.getDataQuotation().getCommencementDateStr());
		dataQuotation.setCorporate(false);
		dataQuotation.setExpiryDateStr(request.getDataQuotation().getExpiryDateStr());
		
		//set InsuredSummary
		InsuredSummary insuredSummary =new InsuredSummary();
		insuredSummary.setType(request.getDataQuotation().getInsuredSummary().getType());
		dataQuotation.setInsuredSummary(insuredSummary);
		dataQuotation.setIssueDateStr("");
		dataQuotation.setNoofday(responseService.dayCounting(request.getDataQuotation().getCommencementDateStr(), request.getDataQuotation().getExpiryDateStr()));
		dataQuotation.setOtherInput(request.getDataQuotation().getOtherInput());
		dataQuotation.setPlan(request.getDataQuotation().getPlan());
		dataQuotation.setPlanB(request.getDataQuotation().getPlanB());
		
		//set PlanBPriceInfo
		PlanBPriceInfo planBPriceInfo =new PlanBPriceInfo();
		planBPriceInfo.setType(request.getDataQuotation().getInsuredSummary().getType());
		dataQuotation.setPlanBPriceInfo(planBPriceInfo);
		dataQuotation.setSelfCover(request.getDataQuotation().getSelfCover());
		dataQuotation.setSpouseCover(request.getDataQuotation().getSpouseCover());
		dataQuotation.setTransactionDateStr("");
		internalResponse.setDataQuotation(dataQuotation);
		return internalResponse;
	}

	public int dayCounting(String starting , String ending){
		int count=0;
		SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");

		try {
		    Date date1 = myFormat.parse(starting);
		    Date date2 = myFormat.parse(ending);
		    count = Math.toIntExact((date2.getTime() - date1.getTime()));
		    count = (int) TimeUnit.DAYS.convert(count, TimeUnit.MILLISECONDS)+1;
		    //System.out.println ("Days: " + TimeUnit.DAYS.convert(count, TimeUnit.MILLISECONDS));
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		return count;
	}
}
