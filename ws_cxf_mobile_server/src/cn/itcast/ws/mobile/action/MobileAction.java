package cn.itcast.ws.mobile.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.ws.mobile.service.MobileService;

/**
 * 
 * <p>Title: MobileAction</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��30������5:37:15
 * @version 1.0
 */
@Controller
public class MobileAction {
	
	
	 @Autowired
	 private MobileService mobileService;
	 
	 @RequestMapping("/queryMobile")
	 public String queryMobile(Model model,String code)throws Exception{
		 
		 
		 //����service��ѯ�ֻ���
		 
		  String result=null;
		  
		  if(code!=null&& !code.equals("")){
			  result = mobileService.queryMobile(code);
		  }
		  
		  model.addAttribute("message", result);
		  //�����߼���ͼ��
		return "queryMobile";
		 
		 
		  
		
		 
		 
	 }
	  

}
