package beans;

public class NewStudent {

	

	
	private int sid;
	private String sname;
	private String semail;
	private String saddress;
	public NewStudent(int sid, String sname, String semail, String saddress) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
		this.saddress = saddress;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	

}
