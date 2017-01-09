package com.linknet.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.linknet.data.ControlName;

public class WsTest {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://novair1-ph-rc2:8080/CommandTranslator/Translate?wsdl");
        QName qname = new QName("http://services.linknet.com/", "TranslateImplService");
        Service service = Service.create(url, qname);
        Translate hello = service.getPort(Translate.class);
        hello.command(ControlName.NOVA_TV, "KEY_POWER");
	}
}
