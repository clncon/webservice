package cn.itcast.ws.jaxws.weather.client;

import cn.itcast.ws.jaxws.weather.server.WebServiceInterfaceImpl;
import cn.itcast.ws.jaxws.weather.server.WebServiceInterfaceImplService;

public class WeatherClient {
	
	 public static void main(String[] args) {
		
		 //创建服务视图对象
		 WebServiceInterfaceImplService webServiceInterfaceImplService = new WebServiceInterfaceImplService();
		 
		 
		 //通过服务视图得到portType(接口类型)
		 
		 WebServiceInterfaceImpl webServiceInterfaceImpl = webServiceInterfaceImplService.getWebServiceInterfaceImplPort();
		 
		 
		 //调用webservice方法
		 
		   String result = webServiceInterfaceImpl.queryName("合肥");
		   
		   System.out.println(result);
		 
		   
	}

}
