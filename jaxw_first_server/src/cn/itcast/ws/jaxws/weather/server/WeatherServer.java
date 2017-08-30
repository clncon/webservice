package cn.itcast.ws.jaxws.weather.server;

import javax.xml.ws.Endpoint;

/**
 * 
 * <p>Title: WeatherServer</p>
 * <p>Description: 发布天气查询的服务</p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月23日下午5:25:28
 * @version 1.0
 */
public class WeatherServer {
	
	
	  public static void main(String[] args) {
		
		  
		   //发布天气查询服务
		   //第一个参数：webservice的地址
		   //第二个参数：使用@webservic标记的服务对象
		  
		  Endpoint.publish("http://127.0.0.1:54321/weather", new WebServiceInterfaceImpl());
	}

}
