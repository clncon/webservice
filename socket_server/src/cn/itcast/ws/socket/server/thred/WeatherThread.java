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
	   	  //�ȴ��ͻ��˵ķ��ʵ�
			  DataInputStream dataInputStream =null;
	    	  DataOutputStream dataOutputStream=null;
	    	
 
 
    	  
    	
    		  
    		  
    		
    			  try {
					
					  //ȡ���������������
					  dataInputStream = new DataInputStream(socket.getInputStream());
					  
					  dataOutputStream = new DataOutputStream(socket.getOutputStream());
					  
					  
					  
					  //�ӿͻ��˶�ȡ����
					  System.out.println("from client:"+dataInputStream.readUTF());
					  //ʹ�þ�̬����
					  //ģ�⴦��ʱ��(3s)
					   Thread.sleep(3000);
					  //�ӷ�����������
					  dataOutputStream.writeUTF("����");
					  System.out.println("to client:"+"����");
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
