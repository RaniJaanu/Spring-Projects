package constructorMode;

public class Department {
	private int deptid;
	private String deptname;
	public Department(int deptid, String deptname) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
	}
	public Department() {

	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + "]";
	}
}




