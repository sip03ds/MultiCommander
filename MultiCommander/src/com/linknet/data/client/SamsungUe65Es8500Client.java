package com.linknet.data.client;

public class SamsungUe65Es8500Client extends AbstractClient {

	public SamsungUe65Es8500Client(String wsdl, String serviceName, String targetNameSpace) {
		super(wsdl, serviceName, targetNameSpace);
	}
	public SamsungUe65Es8500Client() {
		super("","TranslateImplService","http://services.linknet.com/");
	}
}