package com.linknet.data.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.linknet.data.ControlName;
import com.linknet.services.Translate;

public abstract class AbstractClient implements Client {
	public AbstractClient(String wsdl, String serviceName, String targetNameSpace) {
		super();
		this.wsdl = wsdl;
		this.serviceName = serviceName;
		this.targetNameSpace = targetNameSpace;
	}
	@Override
	public String getWsdl() {
		return wsdl;
	}
	@Override
	public void setWsdl(String wsdl) {
		this.wsdl = wsdl;
	}
	@Override
	public String getServiceName() {
		return serviceName;
	}
	@Override
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	@Override
	public String getTargetNameSpace() {
		return targetNameSpace;
	}
	@Override
	public void setTargetNameSpace(String targetNameSpace) {
		this.targetNameSpace = targetNameSpace;
	}
	@Override
	public void callService(ControlName cn , String command) {
		try {
			URL url = new URL(getWsdl());
	        QName qname = new QName(getTargetNameSpace() , getServiceName());
	        Service service = Service.create(url, qname);
	        Translate request = service.getPort(Translate.class);
	        request.command(cn , command);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}	
	private String wsdl;
	private String serviceName;
	private String targetNameSpace;
}
