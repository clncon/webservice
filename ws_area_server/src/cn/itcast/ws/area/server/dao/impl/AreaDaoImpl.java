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
			  //ע������
			Class.forName("com.mysql.jdbc.Driver");
			
			
			 //ȡ������
			conn = DriverManager.getConnection("jdbc:mysql:///webservice", "root","root");
			
			//����sql���
			String sql = "select * from area where parentid=? limit ?,?";
			
			
			 //����Ԥ�������
              pt = conn.prepareStatement(sql);
              
              //���ò���
              
                pt.setString(1, parentid);
                pt.setInt(2, start);
                pt.setInt(3, pageSize);
                
                
                //ִ��sql���
                
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
