package com.btc.Equals;

public class Address 
{
	
String area;
String city;

	    public Address(String area, String city) 
	    {
	    	this.area=area;
	    	this.city=city;
	    }

	    public String getArea() {
	        return "";
	    }

	    public void setArea(String area) {
	            }

	    public String getCity() {
	        return "";
	    }

	    public void setCity(String city) {

	    }

	    @Override
	    public boolean equals(Object other)
	    {
	    	Address obj = (Address)other;
	    	return this.area.equals(obj.area)&& this.city==obj.city;
	    }
}
