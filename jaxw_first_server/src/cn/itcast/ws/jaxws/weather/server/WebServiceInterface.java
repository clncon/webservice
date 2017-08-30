package cn.itcast.ws.jaxws.weather.server;

/**
 * 
 * <p>Title: WebServiceInterface</p>
 * <p>Description: webservice服务接口</p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月23日下午5:20:12
 * @version 1.0
 */
public interface WebServiceInterface {
	
	 /**
	  * 
	  * <p>Title: queryName</p>
	  * <p>Description: 查询某个城市的天气</p>
	  * @param cityName
	  * @return
	  */
	 public String queryName(String cityName);

}
