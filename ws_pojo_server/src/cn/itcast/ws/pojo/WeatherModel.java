package cn.itcast.ws.pojo;

import java.util.Date;

/**
 * 
 * <p>Title: WeatherModel</p>
 * <p>Description: ������Ϣģ��</p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��27������3:28:50
 * @version 1.0
 */
public class WeatherModel {
	
	
	  //��������
	
	   private String detail;
	   
	   //����
	   
	  private Date date;
	  
	   //����¶�
	  
	   private int temperature_max;
	   
	   //����¶�
	   
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
