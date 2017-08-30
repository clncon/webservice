package cn.itcast.ws.jaxws.weather.server;

import javax.jws.WebService;


/**
 * 
 * <p>Title: WebServiceInterfaceImpl</p>
 * <p>Description: 使用webservice发布天气服务</p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月23日下午5:19:06
 * @version 1.0
 */
@WebService
public class WebServiceInterfaceImpl implements WebServiceInterface{

	@Override
	public String queryName(String cityName) {
	  
		
		//使用静态数据
		 //---
		String result="晴";
		
		//向客户端返回数据
		System.out.println("to client:"+result);
		return result;
	}

}
