package cn.itcast.ws.area.server.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.itcast.ws.area.server.service.impl.AreaServiceInterfaceImpl;

public class AreaServiceInterfaceImplTest {


	@Test
	public void test() {
	 
		
		   AreaServiceInterfaceImpl areaServiceInterfaceImpl = new AreaServiceInterfaceImpl();
		   
		   
		   String xmlString ="<?xml version=\"1.1\" encoding=\"utf-8\"?>"
		   		+ "<queryarea>"
				+"<parentid>1.</parentid>" 
		   		+"<start>1</start>"
		   		+"<end>10</end>"
				+"</queryarea>";
	
		  String result =  areaServiceInterfaceImpl.queryString(xmlString);
		  System.out.println(result);
	}

}
