package cn.itcast.ws.service;

import java.util.List;

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
public interface WeatherInterface {
	
	 
	 //查询三天天气
	
	  public List<WeatherModel> queryWeather(String cityName);

}
