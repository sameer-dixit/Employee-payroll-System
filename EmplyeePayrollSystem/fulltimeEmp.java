package EmplyeePayrollSystem;

class fulltimeEmp extends Employee{
	private double monthlysalary;
	public fulltimeEmp(String name,int id,double monthlysalary) {
		super(name,id);
		this.monthlysalary=monthlysalary;
	}
	@Override
	public double calculatesalary() {
		return monthlysalary;
	}
}