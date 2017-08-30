package cn.itcast.ws.service;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.BindingType;

import cn.itcast.ws.pojo.WeatherModel;

/**
 * 
 * <p>Title: WeatherInterface</p>
 * <p>Description: 天气查询</p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月27日下午3:32:15
 * @version 1.0
 */
@WebService(targetNamespace="http://weather.itcast.cn/",//指定wsdl的名称空间
name="weatherInterface",//指定portType的名称
portName="WeatherInterfacePort",//指定wsdl的名称空间
serviceName="WeatherService"//服务视图名称
/* endpointInterface="cn.itcast.ws.service.WeatherInterface2"*/
		)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface WeatherInterface {
	
	 
	 //查询三天天气
	
	  public List<WeatherModel> queryWeather(String cityName);

}
