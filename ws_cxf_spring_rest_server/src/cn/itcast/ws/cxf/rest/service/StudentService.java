package cn.itcast.ws.cxf.rest.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cn.itcast.ws.cxf.rest.pojo.Student;

/**
 * 
 * <p>Title: StudentService</p>
 * <p>Description: rest的SEI</p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月29日下午7:26:00
 * @version 1.0
 */
@WebService
@Path("/student")
public interface StudentService {

	//查询学生信息
	@GET  //http的get方法
	@Path("/query/{id}")//id参数通过url传递
	@Produces({"application/xml;charset=UTF-8"})//设置媒体类型xml格式
	public Student queryStudent(@PathParam("id") long id);
	 
	
	//查询学生列表
	
	@GET  //http的get方法
	@Path("/queryList/{type}")//id参数通过url传递
	@Produces({"application/json;charset=utf-8",MediaType.APPLICATION_XML})//设置媒体类型xml格式和json格式
	//如果想让rest返回xml需要在rest的url后边添加?_type=xml,默认为xml
	//如果想让rest返回json需要在rest的url后边添加?_type=json
	public List<Student> queryStudentList(@PathParam("type") String type);
}
