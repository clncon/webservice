package cn.itcast.ws.jaxws.weather.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import cn.itcast.ws.jaxws.weather.server.WebServiceInterfaceImpl;

/**
 * 
 * <p>Title: WeatherClient2</p>
 * <p>Description: ʹ��jaxws��׼��������webservice</p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��24������9:53:03
 * @version 1.0
 */
public class WeatherClient2 {

	public static void main(String[] args) throws MalformedURLException {
		//wsdl��·��
		
		URL wsdlDocumentLocation = new URL("http://127.0.0.1:54321/weather?wsdl");
		
		
		 //��wsdl���ҵ�������ͼ
		//�ӵ�һ��������wsdl�������ռ�
		//�ڶ���������������ͼ������
		QName serviceName = new QName("http://server.weather.jaxws.ws.itcast.cn/","WebServiceInterfaceImplService");
		
		//��һ��ʹ��service����������ͼ
		Service service = Service.create(wsdlDocumentLocation, serviceName);
		
		//�ӷ�����ͼ�õ�portType����
		
		//����:portType
		
		  WebServiceInterfaceImpl webServiceInterfaceImpl = service.getPort(WebServiceInterfaceImpl.class);
		  
		  
		  //����porttype����
		  
		   String result = webServiceInterfaceImpl.queryName("����");
		   
		   System.out.println(result);

	}

}
