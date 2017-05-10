package beans;

public class SEmp extends Employee{
private String tool;

public SEmp() {
	
	// TODO Auto-generated constructor stub
}

public SEmp(int id, String name, String email, int salary, String tool) {
	super(id, name, email, salary);
	this.tool=tool;
	// TODO Auto-generated constructor stub
}

public String getTool() {
	return tool;
}

public void setTool(String tool) {
	this.tool = tool;
}

	

}
