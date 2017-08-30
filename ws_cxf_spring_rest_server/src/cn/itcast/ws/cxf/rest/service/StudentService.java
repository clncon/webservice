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
 * <p>Description: rest��SEI</p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��29������7:26:00
 * @version 1.0
 */
@WebService
@Path("/student")
public interface StudentService {

	//��ѯѧ����Ϣ
	@GET  //http��get����
	@Path("/query/{id}")//id����ͨ��url����
	@Produces({"application/xml;charset=UTF-8"})//����ý������xml��ʽ
	public Student queryStudent(@PathParam("id") long id);
	 
	
	//��ѯѧ���б�
	
	@GET  //http��get����
	@Path("/queryList/{type}")//id����ͨ��url����
	@Produces({"application/json;charset=utf-8",MediaType.APPLICATION_XML})//����ý������xml��ʽ��json��ʽ
	//�������rest����xml��Ҫ��rest��url������?_type=xml,Ĭ��Ϊxml
	//�������rest����json��Ҫ��rest��url������?_type=json
	public List<Student> queryStudentList(@PathParam("type") String type);
}
