package cn.itcast.ws.socket.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.itcast.ws.socket.server.thred.WeatherThread;

public class WeatherServer {
	
	
          public static void main(String[] args) throws IOException {
        	 
        	  //创建服务端口
        	  
        	  ServerSocket serverSocket = new ServerSocket(12345);
        	  System.out.println("启动天气查询服务。。。。。。。");
        	  
        	  
        	  while(true){
        		  
        		  
        		  
        		  try {
        			  Socket socket =  serverSocket.accept();
        			  
        			   //可以使用线程池
        			  
        			  ThreadPoolExecutor th = new ThreadPoolExecutor(0, Integer.MAX_VALUE,  
                              60L, TimeUnit.SECONDS,  
                              new SynchronousQueue<Runnable>());
        			  
        			  
        			  th.getThreadFactory().newThread(new WeatherThread(socket)).start();
        			  
        			  
        			 
        		  } catch (Exception e) {
        			  // TODO Auto-generated catch block
        			  e.printStackTrace();
        		  }
        		  
        	  }
        	  }
	  

}
