package beans;

public class AdminEmp extends Employee {
private String branch;
public AdminEmp(){
	
}
public AdminEmp(int id, String name, String email, int salary,String branch) {
	super(id, name, email, salary);
	this.branch=branch;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}

}
