package cn.itcast.ws.area.server.service.impl;

import java.util.List;



import javax.jws.WebService;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import cn.itcast.ws.area.server.dao.AreaDao;
import cn.itcast.ws.area.server.dao.impl.AreaDaoImpl;
import cn.itcast.ws.area.server.entity.Area;
import cn.itcast.ws.area.server.service.AreaServiceInterface;
@WebService
public class AreaServiceInterfaceImpl implements AreaServiceInterface {

	
	  AreaDao areadao = new AreaDaoImpl();
	public String queryString(String xmlString) {
	
		  //����xml�ļ�ȡ����������
		
		 Area area = paraseXml(xmlString);
		
		 List<Area> list = areadao.querAreaList(area.getParentid(),area.getStart(),area.getEnd());
		 
		 //��listת����xml���ݷ���
		 
		 String resultString = paraseListToXml(list);
			 
		return  resultString;
	}
	
	
	
	
	/**
	 * 
	 * <p>Title: paraseListToXml</p>
	 * <p>Description: ��listת����xml���ݷ���</p>
	 * @param list //���򼯺�
	 * @return
	 */
	
	/*<?xml version="1.0" encoding="UTF-8"?>
	<areas>
	<area>
	<areaid> </areaid>//����id
	<areaname></areaname>//��������
	<arealevel></arealevel>//����ȼ�
	<parentid></parentid>//��������id
	</area>
	//��..
	</areas>*/

	private String paraseListToXml(List<Area> list) {
	  
		//����Document����
		
		 Document document  = DocumentHelper.createDocument();
		 
		 //��Ӹ��ڵ�
		 
		 Element root = DocumentHelper.createElement("areas");
		 
		 //��Ӹ��ڵ�
		 
		  document.add(root);
		  
		  
		   //ѭ��
		  
		     for(Area area : list){
		    	//����area�ڵ�
		    	   Element areaElement = DocumentHelper.createElement("area");
		    	   
		    	   
		    	   Element areaidElement = DocumentHelper.createElement("areaid");
		    	    areaidElement.addText(area.getAreaid());
		    	    Element areanameElement = DocumentHelper.createElement("areaname");
		    	    areanameElement.addText(area.getAreaname());
		    	    Element areanlevelElement = DocumentHelper.createElement("arealevel");
		    	     areanlevelElement.addText(area.getArealevel());
		    	     Element parentidElement = DocumentHelper.createElement("parentid");
		    	       parentidElement.addText(area.getParentid());
		    	     
		    	     areaElement.add(areaidElement);
		    	     areaElement.add(areanameElement);
		    	     areaElement.add(areanlevelElement);
		    	     areaElement.add(parentidElement);
		    	     
		    	     
		    	     root.add(areaElement);
		    	     
		    	   
		    	   
		     }
		  
		return document.asXML();
	}



	@SuppressWarnings("unused")
	/*<?xml version="1.1"  encoding="utf-8"?>
	<queryarea>
	<parentid> </parentid>//��������id
	<start></start>//��ʼ��¼����1��ʼ
	<end></end>//������¼
	</queryarea>*/

	private Area paraseXml( String areainfo ){
		
		
		Area area = new Area();
		
		//ȡ��areainfo���ɵ�document����
		
		 try {
			Document document = DocumentHelper.parseText(areainfo);
			System.out.println(document.toString());
			
			//ȡ��document�е�parentid
			 String parentid = document.selectSingleNode("/queryarea/parentid").getText();
			 
			 //ͬ��ȡ��start,end
			 
			 String start = document.selectSingleNode("/queryarea/start").getText();
			 String end = document.selectSingleNode("/queryarea/end").getText();
			 
			 
			 //���ö���ֵ
			  area.setParentid(parentid);
			  area.setStart(Integer.parseInt(start));
			  area.setEnd(Integer.parseInt(end));
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return area;
		
		 
		
		
	}

}
