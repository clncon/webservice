package cn.itcast.ws.area.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import cn.itcast.ws.area.server.service.impl.AreaServiceInterfaceImpl;


/**
 * 
 * <p>Title: AreaClient</p>
 * <p>Description: 区域查询客户端</p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月26日下午5:30:22
 * @version 1.0
 */
public class AreaClient {

	public static void main(String[] args) throws Exception {
	  
		
		 //wsdl地址
		 URL wsdlDocumentLocation = new URL("http://127.0.0.1:12345/Area?wsdl");
		 
		 
		 //serviceName
		 
		 QName serviceName = new QName("http://impl.service.server.area.ws.itcast.cn/","AreaServiceInterfaceImplService");

		 
		  //创建服务视图
		 
		  Service service = Service.create(wsdlDocumentLocation,serviceName);
		  
		  //得到portType
		  
		   AreaServiceInterfaceImpl areaServiceInterfaceImpl = (AreaServiceInterfaceImpl) service.getPort(AreaServiceInterfaceImpl.class);
		   
		   
		    //调用方法
		   
		    //发送xml数据
		   
		     //查询parentid等于1，起始记录从1，结束下标为15
		   
		   String requestString = getXmlString("1.",1,15);
		   
		    String responseString = areaServiceInterfaceImpl.queryString(requestString);
		    
		    System.out.println(responseString);
	}

	 /**
	  * 
	  * <p>Title: getXmlString</p>
	  * <p>Description: </p>
	  * @param string //parentid
	  * @param i //start
	  * @param j //end
	  * @return
	  */
	private static String getXmlString(String string, int i, int j) {
		  String xmlString ="<?xml version=\"1.1\" encoding=\"utf-8\"?>"
			   		+ "<queryarea>"
					+"<parentid>"+string+"</parentid>" 
			   		+"<start>"+i+"</start>"
			   		+"<end>"+j+"</end>"
					+"</queryarea>";
		return xmlString;
	}

}
