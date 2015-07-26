package com.investment.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;

import com.investment.annotations.Loggable;

public class GetQuoteService {
	
	private String serviceURL;
	
	private String serviceURLAppend;

	private static final Logger logger=Logger.getLogger(GetQuoteService.class);
	
	@Loggable
	public String getQuote(String symbol){
		URL url=null;
		try {
			url = new URL(serviceURL+symbol+serviceURLAppend);
		} catch (MalformedURLException e) {	
			//e.printStackTrace();
			logger.error(e.getMessage());
		}
		String output="";
		try {
			HttpURLConnection conn= (HttpURLConnection)url.openConnection();
			BufferedReader reader=new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String temp;
			while((temp=reader.readLine())!=null){
				output+=temp;
			}
			conn.disconnect();
		} catch (IOException e) {
			//e.printStackTrace();
			logger.error(e.getMessage());
		}
		return output;
	}

	/**
	 * @return the serviceURL
	 */
	public String getServiceURL() {
		return serviceURL;
	}

	/**
	 * @param serviceURL the serviceURL to set
	 */
	public void setServiceURL(String serviceURL) {
		this.serviceURL = serviceURL;
	}

	/**
	 * @return the serviceURLAppend
	 */
	public String getServiceURLAppend() {
		return serviceURLAppend;
	}

	/**
	 * @param serviceURLAppend the serviceURLAppend to set
	 */
	public void setServiceURLAppend(String serviceURLAppend) {
		this.serviceURLAppend = serviceURLAppend;
	}
	
}
