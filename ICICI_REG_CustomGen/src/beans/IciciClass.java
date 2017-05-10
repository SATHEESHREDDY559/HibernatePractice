package beans;

public class IciciClass {
	private String acno;
private String name;
private String email;
private int phone;
private int balance;
public IciciClass()
{
	
}
public String getAcno() {
	return acno;
}
public void setAcno(String acno) {
	this.acno = acno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public IciciClass(String acno, String name, String email, int phone, int balance) {
	super();
	this.acno = acno;
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.balance = balance;
}





	
	
	
}
