package cn.itcast.ws.service;

import java.util.List;

import cn.itcast.ws.pojo.WeatherModel;

/**
 * 
 * <p>Title: WeatherInterface</p>
 * <p>Description: ������ѯ</p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��27������3:32:15
 * @version 1.0
 */
public interface WeatherInterface {
	
	 
	 //��ѯ��������
	
	  public List<WeatherModel> queryWeather(String cityName);

}
