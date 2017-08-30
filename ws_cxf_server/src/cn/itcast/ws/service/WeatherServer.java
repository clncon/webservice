package cn.itcast.ws.service;

import javax.xml.ws.Endpoint;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;


public class WeatherServer {

	public static void main(String[] args) {
		
		
		 //Endpoint.publish("http://127.0.0.1:12345/weather",new WeatherInterfaceImpl());

		  //ʹ��jaxWs����soapЭ���webservice
		
		  JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
		  
		  //ָ��webservice��ַ
		  jaxWsServerFactoryBean.setAddress("http://127.0.0.1:12345/weather");
		  
		  //ָ��porttype
		  
		   jaxWsServerFactoryBean.setServiceClass(WeatherInterface.class);
		   
		   //ָ�����������
		   
		     jaxWsServerFactoryBean.setServiceBean(new WeatherInterfaceImpl());
		     
		     //��������
		     
		      jaxWsServerFactoryBean.create();
	}

}
