package com.linknet.data.client;

import com.linknet.data.ControlName;

public interface Client {
	public String getWsdl();
	public void setWsdl(String wsdl);
	public String getServiceName(); 
	public void setServiceName(String serviceName); 
	public String getTargetNameSpace();
	public void setTargetNameSpace(String targetNameSpace);
	public void callService(ControlName cn , String command);
}
