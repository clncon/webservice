package cn.itcast.ws.jaxws.weather.client;

import cn.itcast.ws.jaxws.weather.server.WebServiceInterfaceImpl;
import cn.itcast.ws.jaxws.weather.server.WebServiceInterfaceImplService;

public class WeatherClient {
	
	 public static void main(String[] args) {
		
		 //����������ͼ����
		 WebServiceInterfaceImplService webServiceInterfaceImplService = new WebServiceInterfaceImplService();
		 
		 
		 //ͨ��������ͼ�õ�portType(�ӿ�����)
		 
		 WebServiceInterfaceImpl webServiceInterfaceImpl = webServiceInterfaceImplService.getWebServiceInterfaceImplPort();
		 
		 
		 //����webservice����
		 
		   String result = webServiceInterfaceImpl.queryName("�Ϸ�");
		   
		   System.out.println(result);
		 
		   
	}

}
