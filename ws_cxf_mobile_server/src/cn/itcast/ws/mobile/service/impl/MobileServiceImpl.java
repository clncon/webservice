package cn.itcast.ws.mobile.service.impl;

import cn.com.webxml.MobileCodeWSSoap;
import cn.itcast.ws.mobile.service.MobileService;



public class MobileServiceImpl implements MobileService{

	//注入查询公网手机号的客户端bean（该bean在sprign配置文件配置，通过spring注入）
   private MobileCodeWSSoap mobileClient; 

	public String queryMobile(String code) {
		
		
		return mobileClient.getMobileCodeInfo(code,"");
	}
	
	
	public void setMobileClient(MobileCodeWSSoap mobileClient) {
		this.mobileClient = mobileClient;
	}
	
	
	
	

}
