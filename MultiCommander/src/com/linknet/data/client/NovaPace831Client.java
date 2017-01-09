package com.linknet.data.client;

public class NovaPace831Client extends AbstractClient {

	public NovaPace831Client(String wsdl, String serviceName, String targetNameSpace) {
		super(wsdl, serviceName, targetNameSpace);
	}
	public NovaPace831Client() {
		super("http://novair1-ph-rc2:8080/CommandTranslator/Translate?wsdl","TranslateImplService","http://services.linknet.com/");
	}
}