package cn.itcast.ws.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import cn.itcast.ws.pojo.WeatherModel;

@WebService(targetNamespace="http://weather.itcast.cn/",//指定wsdl的名称空间
             name="weatherInterface",//指定portType的名称
             portName="WeatherInterfacePort",//指定wsdl的名称空间
             serviceName="WeatherService"//服务视图名称
            /* endpointInterface="cn.itcast.ws.service.WeatherInterface2"*/
		)
public class WeatherInterfaceImpl implements WeatherInterface{

	  @WebMethod(operationName="queryWeatherList",exclude=false)//当exclude为true时，表示该方法不发布成服务
	public @WebResult(name="result")List<WeatherModel> queryWeather(@WebParam(name="cityName") String cityName) {
		
		//构造三天天气
		
		 List<WeatherModel> list = new ArrayList<WeatherModel>();
		 
		 Calendar calendar = Calendar.getInstance();
		 
		 int day = calendar.get(Calendar.DATE);
		 
		 
		 WeatherModel weatherModel_1 = new WeatherModel();
		  weatherModel_1.setDetail("晴");
		  weatherModel_1.setDate(new Date());
		  weatherModel_1.setTemperature_max(36);
		  weatherModel_1.setTemperature_min(25);
		 WeatherModel weatherModel_2 = new WeatherModel();
		 weatherModel_2.setDetail("晴");
		  calendar.set(Calendar.DATE,day+1);
		 weatherModel_2.setDate(calendar.getTime());
		 weatherModel_2.setTemperature_max(36);
		 weatherModel_2.setTemperature_min(25);
		 WeatherModel weatherModel_3 = new WeatherModel();
		 weatherModel_3.setDetail("阴");
		 calendar.set(Calendar.DATE,day+2);
		 weatherModel_3.setDate(calendar.getTime());
		 weatherModel_3.setTemperature_max(20);
		 weatherModel_3.setTemperature_min(6);
		 
		 
		 list.add(weatherModel_1);
		 list.add(weatherModel_2);
		 list.add(weatherModel_3);
		return list;
	}



}
