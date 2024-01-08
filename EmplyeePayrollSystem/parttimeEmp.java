package EmplyeePayrollSystem;

class parttimeEmp extends Employee{
	private int workingHours;
	private double hourlyRate;
	public parttimeEmp(String name,int id,int workingHours,double hourlyRate) {
		super(name,id);
		this.workingHours=workingHours;
		this.hourlyRate=hourlyRate;
	}
	@Override
	public double calculatesalary() {
		return workingHours*hourlyRate;
	}
}
