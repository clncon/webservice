package cn.itcast.ws.area.server.service;

public interface AreaServiceInterface{
	
	 /**
	  * 
	  * <p>Title: queryString</p>
	  * <p>Description: </p>
	  * @param xmlString 是查询区域条件是xml串，包括parentid 区域父节点id
	  * start 起始下标 从1开始
	  * end 结束下标
	  * @return
	  */
	 public String queryString(String xmlString);

}
