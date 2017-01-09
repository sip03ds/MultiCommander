package com.linknet.data.client;

public class AdvanceAccousticsXi60Client extends AbstractClient {

	public AdvanceAccousticsXi60Client(String wsdl, String serviceName, String targetNameSpace) {
		super(wsdl, serviceName, targetNameSpace);
	}
	public AdvanceAccousticsXi60Client() {
		super("","TranslateImplService","http://services.linknet.com/");
	}
}