package cn.itcast.ws.cxf.rest.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.itcast.ws.cxf.rest.pojo.Student;

/**
 * 
 * <p>Title: StudentServiceImpl</p>
 * <p>Description: ѧ����ѯ��rest</p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��29������7:35:49
 * @version 1.0
 */
public class StudentServiceImpl implements StudentService {

	@Override
	public Student queryStudent(long id) {
		//ʹ�þ�̬����
		 Student student = new Student();
		 
		  student.setId(id);
		  student.setName("����");
		  student.setBirthday(new Date());
		return student;
	}

	@Override
	public List<Student> queryStudentList(String type) {
		 //ʹ�þ�̬����
		List<Student> list = new ArrayList<Student>();
		 Student student1 = new Student();
		 
		  student1.setId(10001);
		  student1.setName("����");
		  student1.setBirthday(new Date());
		  Student student2 = new Student();
		  
		  student2.setId(10002);
		  student2.setName("����");
		  student2.setBirthday(new Date());
		  Student student3 = new Student();
		  
		  student3.setId(10003);
		  student3.setName("����");
		  student3.setBirthday(new Date());
		  
		  list.add(student1);
		  list.add(student2);
		  list.add(student3);
		return list;
	}

}
