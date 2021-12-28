package com.mss;

public class StockQuotation {
  public static String getMessage(String name, String country) {
	  return "hello " + name +" from " + country;
  }
  public String getQuotation(String price) {
	  if (price.equals("google")) {
		  return "200";
	
	  }
	  else if(price.equals("Amazon")) {
		  return "400";
	  }
	  else {
		  return "not available ";
	  }
  }
}
