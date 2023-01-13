package com.utils;
//enum is special class in java which has collection of constants or  methods
public class APIResources {

	
	//AddProgramAPI(""),
	//getBatchAPI(""),
	private String resource;
	
	APIResources(String resource)
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
	}
	
	
	
}
