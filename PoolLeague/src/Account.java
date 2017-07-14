import javax.swing.*;
public abstract class Account {
	private String email;
	private String pword;
	private Object type;
	
	private String fname;
	private String sname;
	
	public Account() {
		this.setType(this);
		this.setEmail(null);
		this.setPassword(null);
		this.addName(null, null);
		System.out.println("Account created!");
	}
	
	public void setEmail(String email) {
		email = JOptionPane.showInputDialog("Enter your e-mail: ");
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setPassword(String pword) {
		pword = JOptionPane.showInputDialog("Enter your password(Letters & Numbers: ");
		this.pword = pword;
	}
	
	public String getPassword() {
		return this.pword;
	}
	
	public void setType(Object type) {
		this.type = type;
	}
	
	public Object getType() {
		return this.type;
	}
	
	public void addName(String fname, String sname) {
		fname = JOptionPane.showInputDialog("Please Enter your first name: ");
		this.fname = fname;
		sname = JOptionPane.showInputDialog("Please enter your second name: ");
		this.sname = sname;
	}
	
	public String getFName() {
		return this.fname;
	}
	
	public String getSName() {
		return this.sname;
	}
	
	public void displayDetails() {
		System.out.println("Hi " + this.getFName() + " " + this.getSName() + "\nyour email is "
				+  this.getEmail() + "\nyour account type is: " + this.getType());
		
	}
	

}
