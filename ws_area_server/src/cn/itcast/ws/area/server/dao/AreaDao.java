package cn.itcast.ws.area.server.dao;

import java.util.List;

import cn.itcast.ws.area.server.entity.Area;

 //��ѯ������Ϣ
/**
 * 
 * <p>Title: AreaDao</p>
 * <p>Description: �ṩ�������Ľӿ�</p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��26������1:24:27
 * @version 1.0
 */
public interface  AreaDao {
	
	 /**
	  * 
	  * <p>Title: querAreaList</p>
	  * <p>Description: </p>
	  * @param parentid ���򸸽ڵ�id
	  * @param start ��ʼ�±�
	  * @param pageSize ��¼��
	  * @return
	  */
	  public List<Area> querAreaList(String parentid,int start,int pageSize);

}
