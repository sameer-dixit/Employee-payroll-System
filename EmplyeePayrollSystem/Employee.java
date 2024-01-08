package EmplyeePayrollSystem;

abstract class Employee{
	private String name;
	private int id;
	public Employee(String name,int id) {
		this.name=name;
		this.id=id;
		
	}
	public String getname() {
		return name;
	}
	public int getId() {
		return id;
	}
	public abstract double calculatesalary();
	@Override
	public String toString() {
		return "Employee [name= "+ name+", id= "+id+", Salary= "+calculatesalary()+" ]";
	}
}