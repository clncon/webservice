package cn.itcast.ws.cxf.rest.pojo;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * <p>Title: Student</p>
 * <p>Description: ѧ����Ϣ</p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��29������7:25:01
 * @version 1.0
 */
@XmlRootElement(name="student")
public class Student {
	
	
	 private long id;
	 private String name;
	 private Date birthday;
	 
	 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	 
	 
	 

}
