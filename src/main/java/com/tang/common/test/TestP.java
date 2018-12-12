package com.tang.common.test;

public class TestP {
	
	private final String serviceName;
	
	public TestP(String serviceName){
		this.serviceName = serviceName;
	}
	/*public TestP(String serviceName){
		serviceName = serviceName;
	}*/
	
	 public static final class Builder {
		 private int iii;
		 public Builder buildName(String name){ 
			// serviceName = name;
			 return this;
		 }
	 }

}
