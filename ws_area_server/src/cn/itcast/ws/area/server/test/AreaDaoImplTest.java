package cn.itcast.ws.area.server.test;

import java.util.List;

import org.junit.Test;

import cn.itcast.ws.area.server.dao.AreaDao;
import cn.itcast.ws.area.server.dao.impl.AreaDaoImpl;
import cn.itcast.ws.area.server.entity.Area;

public class AreaDaoImplTest {

	 AreaDao area = new AreaDaoImpl();
	@Test
	public void testQueryAreaList() {
		
		 List<Area> list = area.querAreaList("1.", 3,10);
		 
		 System.out.println(list.size());
		 
		 
	}

}
