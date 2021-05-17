package constructorMode;

import constructorMode.Department; ;

public class Employee {
	private int eid;
	private String ename;
	Department dept;
	public Employee(int eid, String ename, Department dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + "]";
	}
	Employee(Department d) {
		System.out.println(this.eid+" "+ this.ename+" "+this.dept);
	}
}
