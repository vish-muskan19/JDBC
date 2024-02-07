package tutorial_data;

public class Product {
	int pid;
	String pname, ptype;
	
	
	public Product( String pname, String ptype) {
		super();
		
		this.pname = pname;
		this.ptype = ptype;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

}
