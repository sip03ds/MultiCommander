package com.linknet.data.client;

public class DenonX4000Client extends AbstractClient {

	public DenonX4000Client(String wsdl, String serviceName, String targetNameSpace) {
		super(wsdl, serviceName, targetNameSpace);
	}
	public DenonX4000Client() {
		super("","TranslateImplService","http://services.linknet.com/");
	}
}