package cn.itcast.ws.cxf.rest.service;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

public class StudentServer {

	public static void main(String[] args) {
	 
		 
		
		 //ʹ��jaxrServerFactoryBean����rest����
		
		JAXRSServerFactoryBean jaxrsServerFactoryBean = new JAXRSServerFactoryBean();
		
		 //����rest�ķ����ַ
		 jaxrsServerFactoryBean.setAddress("http://127.0.0.1:12345/rest");
		 
		 //���÷������
		 
		 jaxrsServerFactoryBean.setServiceBean(new StudentServiceImpl());
		 
		 //������Դ��������ж��pojo��Դ�������м��԰�Ƕ��Ÿ���
		 
		 jaxrsServerFactoryBean.setResourceClasses(StudentServiceImpl.class);
		 
		 //����rest����
		 
		 jaxrsServerFactoryBean.create();

	}

}
