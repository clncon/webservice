package cn.itcast.ws.area.server.entity;

/**
 * �����po��
 * @author ���ǲ��� JavaѧԺ ������
 * @version V1.0
 */
public class Area {
	//����id	
	private String  areaid;
	
	//��������
	private String areaname; 
	//���򼶱�(0��3)
	private String arealevel;
	//�������id
	private String parentid;
	//��ʼ��¼��
	private Integer start;
	//������¼��
	private Integer end;
	public String getAreaid() {
		return areaid;
	}
	public void setAreaid(String areaid) {
		this.areaid = areaid;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	public String getArealevel() {
		return arealevel;
	}
	public void setArealevel(String arealevel) {
		this.arealevel = arealevel;
	}
	public String getParentid() {
		return parentid;
	}
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getEnd() {
		return end;
	}
	public void setEnd(Integer end) {
		this.end = end;
	}

	public String toString() {
		return "Area [areaid=" + areaid + ", areaname=" + areaname
				+ ", arealevel=" + arealevel + ", parentid=" + parentid
				+ ", start=" + start + ", end=" + end + "]";
	}
	
	
	
	
}

