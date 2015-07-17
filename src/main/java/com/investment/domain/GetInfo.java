package com.investment.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.investment.domain.objects.Resource;
import com.investment.services.GetQuoteService;

public class GetInfo {
	@Autowired
	GetQuoteService getQuoteService;
	/**
	 * 
	 */
	public GetInfo() {
		
	}

	public Resource getStockInfo(String symbol){
		String serviceUrl="http://finance.Yahoo.com/webservice/v1/symbols/"+symbol+"/quote?format=json";
		String output=getQuoteService.getQuote(symbol);
		Gson gson=new Gson();
		JsonParser parser=new JsonParser();
		JsonObject obj=(JsonObject) parser.parse(output);
		obj=obj.getAsJsonObject("list").getAsJsonArray("resources").get(0).getAsJsonObject().getAsJsonObject("resource");
		Resource res=gson.fromJson(obj.toString(), Resource.class);
		return res;		
	}
}
