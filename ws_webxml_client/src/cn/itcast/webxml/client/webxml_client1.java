package cn.itcast.webxml.client;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;



public class webxml_client1 {
	
	
	
	  public static void main(String[] args) {
		
		  
		 //����������ͼ
		  
		  MobileCodeWS mobileCodeWS = new MobileCodeWS();
		  
		  //�õ�portType
		  
		  MobileCodeWSSoap mobileCodeWSSoap = mobileCodeWS.getMobileCodeWSSoap();
		  
		  
		  //���÷���
		  //ArrayOfString array = mobileCodeWSSoap.getDatabaseInfo();
		  
		 String result = mobileCodeWSSoap.getMobileCodeInfo("13080675754","");
		 
		 System.out.println(result);
		  
		/*  List<String>  list = array.getString();
		  
		  
		  for(String string:list){
			  
			  System.out.println(string);
		  }*/
		   
	}
	
	
	

}
