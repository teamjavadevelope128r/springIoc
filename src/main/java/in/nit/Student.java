package in.nit;

public class Student {
	private String name;
	private String lname;
	private String addrs;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setLname(String lname) {
		this.lname=lname;
	}
	public void setAddrs(String addrs) {
		this.addrs=addrs;
	}
	
     public void Display() {
    	 System.out.println("name"+name+"lname"+lname+"addrs"+addrs);
     }
	

}
