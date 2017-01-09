package com.linknet.data.client;

public class LgTm2792sClient extends AbstractClient {

	public LgTm2792sClient(String wsdl, String serviceName, String targetNameSpace) {
		super(wsdl, serviceName, targetNameSpace);
	}
	public LgTm2792sClient() {
		super("","TranslateImplService","http://services.linknet.com/");
	}
}