package cn.itcast.webxml.client;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;



public class webxml_client1 {
	
	
	
	  public static void main(String[] args) {
		
		  
		 //创建服务视图
		  
		  MobileCodeWS mobileCodeWS = new MobileCodeWS();
		  
		  //得到portType
		  
		  MobileCodeWSSoap mobileCodeWSSoap = mobileCodeWS.getMobileCodeWSSoap();
		  
		  
		  //调用方法
		  //ArrayOfString array = mobileCodeWSSoap.getDatabaseInfo();
		  
		 String result = mobileCodeWSSoap.getMobileCodeInfo("13080675754","");
		 
		 System.out.println(result);
		  
		/*  List<String>  list = array.getString();
		  
		  
		  for(String string:list){
			  
			  System.out.println(string);
		  }*/
		   
	}
	
	
	

}
