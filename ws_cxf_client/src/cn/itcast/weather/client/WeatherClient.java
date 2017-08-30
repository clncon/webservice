package cn.itcast.weather.client;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import cn.itcast.weather.WeatherInterface;
import cn.itcast.weather.WeatherModel;




public class WeatherClient {

	public static void main(String[] args) {
		
		
		//jaxWsProxyFactoryBean调用webservice服务端
		
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean= new JaxWsProxyFactoryBean();
		
		//调用地址
		 jaxWsProxyFactoryBean.setAddress("http://127.0.0.1:12345/weather?wsdl");
		 
		 
		 //设置portType
		 
		  jaxWsProxyFactoryBean.setServiceClass(WeatherInterface.class);
		  
		  //创建portType
		  
		  WeatherInterface weatherInterface = (WeatherInterface) jaxWsProxyFactoryBean.create();
		
		  
		  //调用portType的方法
		  
		  List<WeatherModel> list = weatherInterface.queryWeatherList("合肥");
			
			for(WeatherModel weatherModel:list){
				
				System.out.println(weatherModel.getDetail());
				Date date = weatherModel.getDate().toGregorianCalendar().getTime();
				System.out.println(new SimpleDateFormat("yyy-MM-dd").format(date));
				System.out.println(weatherModel.getTemperatureMax());
				System.out.println(weatherModel.getTemperatureMin());
			}

	}

}
