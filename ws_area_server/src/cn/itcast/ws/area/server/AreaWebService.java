package cn.itcast.ws.area.server;

import javax.xml.ws.Endpoint;

import cn.itcast.ws.area.server.service.impl.AreaServiceInterfaceImpl;


public class AreaWebService {

	public static void main(String[] args) {
	
		Endpoint.publish("http://127.0.0.1:12345/Area", new AreaServiceInterfaceImpl());
		
		System.out.println(Endpoint.WSDL_PORT);
		 
		

	}

}
