package cn.itcast.ws.mobile.service.impl;

import cn.com.webxml.MobileCodeWSSoap;
import cn.itcast.ws.mobile.service.MobileService;



public class MobileServiceImpl implements MobileService{

	//ע���ѯ�����ֻ��ŵĿͻ���bean����bean��sprign�����ļ����ã�ͨ��springע�룩
   private MobileCodeWSSoap mobileClient; 

	public String queryMobile(String code) {
		
		
		return mobileClient.getMobileCodeInfo(code,"");
	}
	
	
	public void setMobileClient(MobileCodeWSSoap mobileClient) {
		this.mobileClient = mobileClient;
	}
	
	
	
	

}
