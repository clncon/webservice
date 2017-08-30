package cn.itcast.webxml.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;


import cn.com.webxml.MobileCodeWSSoap;

/**
 * 
 * <p>Title: webxml_client2</p>
 * <p>Description: 使用jaxw标准方法调用服务端</p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月24日下午10:05:40
 * @version 1.0
 */
public class webxml_client2 {
	
	 public static void main(String[] args) throws MalformedURLException {
		
		 //创建服务视图
		 
		  //通过指定公网地址
		  URL wsdlDocumentLocation = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");
		  
		  
		  QName serviceName = new QName("http://WebXml.com.cn/", "MobileCodeWS");
		  
		  
		  Service service = Service.create(wsdlDocumentLocation, serviceName);
		  
		  //得到portType
		  
		   MobileCodeWSSoap mobileCodeWSSoap = service.getPort(MobileCodeWSSoap.class);
		   
		   //调用方法
		   
		   String result =  mobileCodeWSSoap.getMobileCodeInfo("15375103430","");
		  System.out.println(result);
		  
		 
	}

}
