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
	
		  //解析xml文件取得所需数据
		
		 Area area = paraseXml(xmlString);
		
		 List<Area> list = areadao.querAreaList(area.getParentid(),area.getStart(),area.getEnd());
		 
		 //将list转换成xml数据返回
		 
		 String resultString = paraseListToXml(list);
			 
		return  resultString;
	}
	
	
	
	
	/**
	 * 
	 * <p>Title: paraseListToXml</p>
	 * <p>Description: 将list转换成xml数据返回</p>
	 * @param list //区域集合
	 * @return
	 */
	
	/*<?xml version="1.0" encoding="UTF-8"?>
	<areas>
	<area>
	<areaid> </areaid>//区域id
	<areaname></areaname>//区域名称
	<arealevel></arealevel>//区域等级
	<parentid></parentid>//父级区域id
	</area>
	//…..
	</areas>*/

	private String paraseListToXml(List<Area> list) {
	  
		//创建Document对象
		
		 Document document  = DocumentHelper.createDocument();
		 
		 //添加根节点
		 
		 Element root = DocumentHelper.createElement("areas");
		 
		 //添加根节点
		 
		  document.add(root);
		  
		  
		   //循环
		  
		     for(Area area : list){
		    	//创建area节点
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
	<parentid> </parentid>//父级区域id
	<start></start>//起始记录，从1开始
	<end></end>//结束记录
	</queryarea>*/

	private Area paraseXml( String areainfo ){
		
		
		Area area = new Area();
		
		//取得areainfo生成的document对象
		
		 try {
			Document document = DocumentHelper.parseText(areainfo);
			System.out.println(document.toString());
			
			//取得document中的parentid
			 String parentid = document.selectSingleNode("/queryarea/parentid").getText();
			 
			 //同理取得start,end
			 
			 String start = document.selectSingleNode("/queryarea/start").getText();
			 String end = document.selectSingleNode("/queryarea/end").getText();
			 
			 
			 //设置对象值
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
