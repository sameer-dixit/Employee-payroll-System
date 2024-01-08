package EmplyeePayrollSystem;

import java.util.ArrayList;

class payrollSystem{
	private ArrayList<Employee> empList;
	
	public payrollSystem() {
		empList=new ArrayList<>();
	}
	public void addemp(Employee emp) {
		empList.add(emp);
	}
	public void removeemp(int id) {
		Employee emptoremove=null;
		for(Employee emp: empList) {
			if(emp.getId()==id) {
				emptoremove=emp;
				break;
			}
		}
		if(emptoremove!=null) {
			empList.remove(emptoremove);
		}
		
		
	}
	public void displayemp() {
		for(Employee emp:empList) {
			System.out.println(emp);
		}
	}
}
