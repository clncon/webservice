package cn.itcast.ws.jaxws.weather.server;

import javax.jws.WebService;


/**
 * 
 * <p>Title: WebServiceInterfaceImpl</p>
 * <p>Description: ʹ��webservice������������</p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��23������5:19:06
 * @version 1.0
 */
@WebService
public class WebServiceInterfaceImpl implements WebServiceInterface{

	@Override
	public String queryName(String cityName) {
	  
		
		//ʹ�þ�̬����
		 //---
		String result="��";
		
		//��ͻ��˷�������
		System.out.println("to client:"+result);
		return result;
	}

}
