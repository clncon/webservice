package cn.itcast.ws.client;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//开启一个http链接
		
		 //webservice地址
		
		URL url = new URL("http://127.0.0.1:12345/weather");
		
		HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
		
		//设置post请求，post是大写
		
		httpURLConnection.setRequestMethod("POST");
		
		//Content-Type：text/html;charset=UTF-8;
		
		httpURLConnection.setRequestProperty("Content-Type","text/xml;charset=utf-8");
		
		
		//设置请求和响应
		
		   httpURLConnection.setDoInput(true);
		   httpURLConnection.setDoOutput(true);
		   
		   
		   String requestString = requestString("苏州");
		   
		   
		    //发送sope协议
		   
		      httpURLConnection.getOutputStream().write(requestString.getBytes());
		      
		      //接收响应内容
		      InputStream inputStream = httpURLConnection.getInputStream();
		      
		      
		       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		       
		       
		       int len=-1;
		       
		       byte[] b= new byte[1024];
		       
		       //将inputStream内容写入到byteArrayOutputStream
		       
		       while((len=inputStream.read(b, 0, 1024))!=-1){
		    	   
		    	   byteArrayOutputStream.write(b, 0, len);
		       }
		       
		       //获取响应内容
		       
		       String responseString = byteArrayOutputStream.toString();
		       
		       System.out.println(responseString);
		       
		       //解析响应的xml文件
		       //......
		   
		   
	}
	
	
	
	 /*
	  <?xml version="1.0" ?>
	  <S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
	  <S:Body>
	   <ns2:queryName xmlns:ns2="http://server.weather.jaxws.ws.itcast.cn/">
	  <arg0>鍖椾含</arg0>
	  </ns2:queryName>
	  </S:Body></S:Envelope>
	  * */
	private static String requestString(String cityName){
		
		
		String xmlString="<?xml version=\"1.0\" ?><S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\"><S:Body><ns2:queryName xmlns:ns2=\"http://server.weather.jaxws.ws.itcast.cn/\"><arg0>"+cityName+"</arg0></ns2:queryName></S:Body></S:Envelope>";
	 
		return xmlString;
		
		
	}

}
