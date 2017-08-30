package cn.itcast.ws.pojo;

import java.util.Date;

/**
 * 
 * <p>Title: WeatherModel</p>
 * <p>Description: 天气信息模型</p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月27日下午3:28:50
 * @version 1.0
 */
public class WeatherModel {
	
	
	  //天气概述
	
	   private String detail;
	   
	   //日期
	   
	  private Date date;
	  
	   //最高温度
	  
	   private int temperature_max;
	   
	   //最低温度
	   
	   private int temperature_min;

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getTemperature_max() {
		return temperature_max;
	}

	public void setTemperature_max(int temperature_max) {
		this.temperature_max = temperature_max;
	}

	public int getTemperature_min() {
		return temperature_min;
	}

	public void setTemperature_min(int temperature_min) {
		this.temperature_min = temperature_min;
	}
	   
	   

}
