package cn.itcast.webxml.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;


import cn.com.webxml.MobileCodeWSSoap;

/**
 * 
 * <p>Title: webxml_client2</p>
 * <p>Description: ʹ��jaxw��׼�������÷����</p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��24������10:05:40
 * @version 1.0
 */
public class webxml_client2 {
	
	 public static void main(String[] args) throws MalformedURLException {
		
		 //����������ͼ
		 
		  //ͨ��ָ��������ַ
		  URL wsdlDocumentLocation = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");
		  
		  
		  QName serviceName = new QName("http://WebXml.com.cn/", "MobileCodeWS");
		  
		  
		  Service service = Service.create(wsdlDocumentLocation, serviceName);
		  
		  //�õ�portType
		  
		   MobileCodeWSSoap mobileCodeWSSoap = service.getPort(MobileCodeWSSoap.class);
		   
		   //���÷���
		   
		   String result =  mobileCodeWSSoap.getMobileCodeInfo("15375103430","");
		  System.out.println(result);
		  
		 
	}

}
