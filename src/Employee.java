
public class Employee implements Comparable<Employee> {
  private int employeeid;
  private String employeename;
  private String employeedesignation;
  private int employeeage;
  
 
  

	public Employee(int employeeid, String employeename, String employeedesignation, int employeeage) {
	super();
	this.employeeid = employeeid;
	this.employeename = employeename;
	this.employeedesignation = employeedesignation;
	this.employeeage = employeeage;
}


	public int getEmployeeid() {
		return employeeid;
	}


	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}


	public String getEmployeename() {
		return employeename;
	}


	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}


	public String getEmployeedesignation() {
		return employeedesignation;
	}



	public void setEmployeedesignation(String employeedesignation) {
		this.employeedesignation = employeedesignation;
	}


	public int getEmployeeage() {
		return employeeage;
	}


	public void setEmployeeage(int employeeage) {
		this.employeeage = employeeage;
	}


	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeedesignation="
				+ employeedesignation + ", employeeage=" + employeeage + "]";
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.getEmployeeage()-o.getEmployeeage();
	}
}

  