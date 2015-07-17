package com.investment.domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.investment.domain.objects.Resource;

public class GetInfo {

	/**
	 * 
	 */
	public GetInfo() {
		
	}

	public Resource getStockInfo(String symbol){
		URL url;
		String serviceUrl="Http://finance.Yahoo.com/webservice/v1/symbols/"+symbol+"/quote?format=json";
		try {
			url=new URL(serviceUrl);
			HttpURLConnection conn= (HttpURLConnection)url.openConnection();
			BufferedReader reader=new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String output="",temp;
			while((temp=reader.readLine())!=null)
				output+=temp;
			Gson gson=new Gson();
			JsonParser parser=new JsonParser();
			JsonObject obj=(JsonObject) parser.parse(output);
			obj=obj.getAsJsonObject("list").getAsJsonArray("resources").get(0).getAsJsonObject().getAsJsonObject("resource");
			Resource res=gson.fromJson(obj.toString(), Resource.class);
			
			conn.disconnect();
			return res;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
