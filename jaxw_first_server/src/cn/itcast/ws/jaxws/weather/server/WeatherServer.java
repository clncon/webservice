package cn.itcast.ws.jaxws.weather.server;

import javax.xml.ws.Endpoint;

/**
 * 
 * <p>Title: WeatherServer</p>
 * <p>Description: ����������ѯ�ķ���</p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��23������5:25:28
 * @version 1.0
 */
public class WeatherServer {
	
	
	  public static void main(String[] args) {
		
		  
		   //����������ѯ����
		   //��һ��������webservice�ĵ�ַ
		   //�ڶ���������ʹ��@webservic��ǵķ������
		  
		  Endpoint.publish("http://127.0.0.1:54321/weather", new WebServiceInterfaceImpl());
	}

}
