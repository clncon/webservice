package cn.itcast.ws.area.server.dao;

import java.util.List;

import cn.itcast.ws.area.server.entity.Area;

 //查询区域信息
/**
 * 
 * <p>Title: AreaDao</p>
 * <p>Description: 提供区域服务的接口</p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月26日下午1:24:27
 * @version 1.0
 */
public interface  AreaDao {
	
	 /**
	  * 
	  * <p>Title: querAreaList</p>
	  * <p>Description: </p>
	  * @param parentid 区域父节点id
	  * @param start 起始下标
	  * @param pageSize 记录数
	  * @return
	  */
	  public List<Area> querAreaList(String parentid,int start,int pageSize);

}
