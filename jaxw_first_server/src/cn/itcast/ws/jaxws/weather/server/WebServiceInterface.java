package cn.itcast.ws.jaxws.weather.server;

/**
 * 
 * <p>Title: WebServiceInterface</p>
 * <p>Description: webservice����ӿ�</p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��23������5:20:12
 * @version 1.0
 */
public interface WebServiceInterface {
	
	 /**
	  * 
	  * <p>Title: queryName</p>
	  * <p>Description: ��ѯĳ�����е�����</p>
	  * @param cityName
	  * @return
	  */
	 public String queryName(String cityName);

}
