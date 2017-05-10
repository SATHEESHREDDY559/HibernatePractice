package beans;

public class HWEmp extends Employee {
	private int wh;
	public HWEmp(){
		
	}
	public HWEmp(int id, String name, String email, int salary,int wh) {
		super(id, name, email, salary);
		// TODO Auto-generated constructor stub
		this.wh=wh;
	}
	public int getWh() {
		return wh;
	}
	public void setWh(int wh) {
		this.wh = wh;
	}
	

}
