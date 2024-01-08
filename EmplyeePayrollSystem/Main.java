package EmplyeePayrollSystem;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		payrollSystem prsystem=new payrollSystem();
		fulltimeEmp emp1=new fulltimeEmp("sameer",1,50000);
		parttimeEmp emp2=new parttimeEmp("sameer",2,77,250);
		prsystem.addemp(emp2);
		prsystem.addemp(emp1);
		System.out.println("<-------Initila Employee Details------->");
		prsystem.displayemp();
		System.out.println("Removing Employees....");
		prsystem.removeemp(2);
		System.out.println("Remaining Employee Details");
		prsystem.displayemp();

	}

}








