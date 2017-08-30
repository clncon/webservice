package cn.itcast.weather.client;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.weather.WeatherInterface;
import cn.itcast.weather.WeatherModel;

public class CxfClient {

	public static void main(String[] args) {
	
		
		 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		 
		 
		 WeatherInterface weatherInterface = (WeatherInterface) applicationContext.getBean("weatherClient");
		 
		 
		 //List<WeatherModel> list = weatherInterface.queryWeather("合肥");
		 
		 //调用portType的方法
		  
		  List<WeatherModel> list = weatherInterface.queryWeather("合肥");
			
			for(WeatherModel weatherModel:list){
				
				System.out.println(weatherModel.getDetail());
				Date date = weatherModel.getDate().toGregorianCalendar().getTime();
				System.out.println(new SimpleDateFormat("yyy-MM-dd").format(date));
				System.out.println(weatherModel.getTemperatureMax());
				System.out.println(weatherModel.getTemperatureMin());
			}

	}

}
