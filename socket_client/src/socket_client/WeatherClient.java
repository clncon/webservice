package socket_client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class WeatherClient {
	
	  public static void main(String[] args) {
		
		   DataInputStream dataInputStream =null;
		   DataOutputStream dataOutputStream=null;
		   Socket socket = null;
		   while(true){
			   try {
					socket = new Socket("127.0.0.1", 12345);
					
					 //取得输入输出流
					
					
					   dataInputStream = new DataInputStream(socket.getInputStream());
					   dataOutputStream = new DataOutputStream(socket.getOutputStream());
					   
					  //向服务端发送数据、
					     String cityName="天津";
					    dataOutputStream.writeUTF(cityName);
					    
					   //客户端接受到的数据
					     String result = dataInputStream.readUTF();
					     System.out.println("from server:"+result);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					
					 try {
						dataInputStream.close();
						 dataOutputStream.close();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 
					 try {
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				   
		   }
		   }
		 

}
