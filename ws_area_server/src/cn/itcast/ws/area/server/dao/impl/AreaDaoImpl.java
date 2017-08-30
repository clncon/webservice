package cn.itcast.ws.area.server.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

import cn.itcast.ws.area.server.dao.AreaDao;
import cn.itcast.ws.area.server.entity.Area;

public class AreaDaoImpl implements AreaDao {

	public List<Area> querAreaList(String parentid, int start, int pageSize) {
		
		Connection conn=null;
		PreparedStatement pt=null;
		ResultSet rs = null;
		
		List<Area> list = new ArrayList<Area>();
		
		
		
		  try {
			  //注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			
			 //取得连接
			conn = DriverManager.getConnection("jdbc:mysql:///webservice", "root","root");
			
			//产生sql语句
			String sql = "select * from area where parentid=? limit ?,?";
			
			
			 //生成预处理语句
              pt = conn.prepareStatement(sql);
              
              //设置参数
              
                pt.setString(1, parentid);
                pt.setInt(2, start);
                pt.setInt(3, pageSize);
                
                
                //执行sql语句
                
                rs = pt.executeQuery();
                
                while(rs.next()){
                	Area area = new Area();
                	
                	 area.setAreaid(rs.getString("areaid"));
                	 area.setAreaname(rs.getString("areaname"));
                	 area.setArealevel(rs.getString("arealevel"));
                	 area.setParentid(rs.getString("parentid"));
                	 
                	 list.add(area);
                	
                	
                }
                
                
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			 
				  
				  try {
					  if(rs!=null){
						  rs.close();
					  }
					  if(pt!=null){
						  
						  pt.close();
					  }
					  if(conn!=null){
						  conn.close();
					  }
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		return list;
	}

}
