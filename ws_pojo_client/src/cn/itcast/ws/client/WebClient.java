package cn.itcast.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import cn.itcast.ws.service.WeatherInterfaceImpl;
import cn.itcast.ws.service.WeatherModel;

public class WebClient {

	public static void main(String[] args) {
	
		  
		
		
		try {
			//ָ��URL
			URL wsdlDocumentLocation = new URL("http://127.0.0.1:12345/weather?wsdl");
			
			//ָ�������ռ�,������������
			
			QName qName = new QName("http://service.ws.itcast.cn/","WeatherInterfaceImplService");
			
			
			//��������
			
			Service service = Service.create(wsdlDocumentLocation, qName);
			
			
			//ȡ�÷���portType
			
			WeatherInterfaceImpl weatherInterfaceImpl = service.getPort(WeatherInterfaceImpl.class);
			
			List<WeatherModel> list = weatherInterfaceImpl.queryWeather("�Ϸ�");
			
			for(WeatherModel weatherModel:list){
				
				System.out.println(weatherModel.getDetail());
				Date date = weatherModel.getDate().toGregorianCalendar().getTime();
				System.out.println(new SimpleDateFormat("yyy-MM-dd").format(date));
				System.out.println(weatherModel.getTemperatureMax());
				System.out.println(weatherModel.getTemperatureMin());
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
