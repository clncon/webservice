package cn.itcast.ws.socket.server.thred;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WeatherThread implements Runnable {

	 private Socket socket=null;
	 
	 public WeatherThread(Socket socket){
		 this.socket=socket;
		 
	 }
	 
	 
	@Override
	public void run() {
	   	  //等待客户端的访问的
			  DataInputStream dataInputStream =null;
	    	  DataOutputStream dataOutputStream=null;
	    	
 
 
    	  
    	
    		  
    		  
    		
    			  try {
					
					  //取得输入流和输出流
					  dataInputStream = new DataInputStream(socket.getInputStream());
					  
					  dataOutputStream = new DataOutputStream(socket.getOutputStream());
					  
					  
					  
					  //从客户端读取数据
					  System.out.println("from client:"+dataInputStream.readUTF());
					  //使用静态数据
					  //模拟处理时间(3s)
					   Thread.sleep(3000);
					  //从服务端输出数据
					  dataOutputStream.writeUTF("晴天");
					  System.out.println("to client:"+"晴天");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally{
					  
					  try {
						dataInputStream.close();
						dataOutputStream.close();
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					  
				  }
    	  
		

	}

}
