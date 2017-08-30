package cn.itcast.ws.jaxws.weather.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import cn.itcast.ws.jaxws.weather.server.WebServiceInterfaceImpl;

/**
 * 
 * <p>Title: WeatherClient2</p>
 * <p>Description: 使用jaxws标准方法调用webservice</p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月24日下午9:53:03
 * @version 1.0
 */
public class WeatherClient2 {

	public static void main(String[] args) throws MalformedURLException {
		//wsdl的路径
		
		URL wsdlDocumentLocation = new URL("http://127.0.0.1:54321/weather?wsdl");
		
		
		 //从wsdl中找到服务视图
		//从第一个参数：wsdl的命名空间
		//第二个参数：服务视图的名称
		QName serviceName = new QName("http://server.weather.jaxws.ws.itcast.cn/","WebServiceInterfaceImplService");
		
		//第一步使用service创建服务视图
		Service service = Service.create(wsdlDocumentLocation, serviceName);
		
		//从服务视图得到portType对象
		
		//参数:portType
		
		  WebServiceInterfaceImpl webServiceInterfaceImpl = service.getPort(WebServiceInterfaceImpl.class);
		  
		  
		  //调用porttype方法
		  
		   String result = webServiceInterfaceImpl.queryName("北京");
		   
		   System.out.println(result);

	}

}
