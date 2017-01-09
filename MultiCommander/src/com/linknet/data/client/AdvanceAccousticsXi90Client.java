package com.linknet.data.client;

public class AdvanceAccousticsXi90Client extends AbstractClient {

	public AdvanceAccousticsXi90Client(String wsdl, String serviceName, String targetNameSpace) {
		super(wsdl, serviceName, targetNameSpace);
	}
	public AdvanceAccousticsXi90Client() {
		super("","TranslateImplService","http://services.linknet.com/");
	}
}