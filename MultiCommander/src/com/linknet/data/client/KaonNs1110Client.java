package com.linknet.data.client;

public class KaonNs1110Client extends AbstractClient {

	public KaonNs1110Client(String wsdl, String serviceName, String targetNameSpace) {
		super(wsdl, serviceName, targetNameSpace);
	}
	public KaonNs1110Client() {
		super("http://otetvir1-ph-rc2:8080/CommandTranslator/Translate?wsdl","TranslateImplService","http://services.linknet.com/");
	}
}