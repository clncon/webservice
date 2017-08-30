package cn.itcast.ws.mobile.service;

import javax.jws.WebService;

@WebService
public interface MobileService {

	
	 String queryMobile(String code);
}
