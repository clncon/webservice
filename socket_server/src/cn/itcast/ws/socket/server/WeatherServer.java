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
        	 
        	  //��������˿�
        	  
        	  ServerSocket serverSocket = new ServerSocket(12345);
        	  System.out.println("����������ѯ���񡣡�����������");
        	  
        	  
        	  while(true){
        		  
        		  
        		  
        		  try {
        			  Socket socket =  serverSocket.accept();
        			  
        			   //����ʹ���̳߳�
        			  
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
