package assignment2;
class Employee{
	String firstName;
	String lastName;
	double salary;
	Employee(String firstName,String lastName,double salary){
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastname) {
		this.lastName=lastName;
	}
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double salary) {
		if(salary<0) {
			this.salary=0.0;
		}else {
			this.salary=salary;
		}
	}
	public double yearlySalary() {
		return this.salary*12;
	}
}
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Harish","Monika",10000.0);
		Employee e2=new Employee("Ganesh","Monika",20000.0);
		System.out.println(e1.firstName);
		System.out.println(e1.lastName);
		System.out.println(e1.salary);
		System.out.println(e1.yearlySalary());
		e1.setSalary(e1.salary+((e1.salary/100)*10));
		System.out.println(e2.firstName);
		System.out.println(e2.lastName);
		System.out.println(e2.salary);
		System.out.println(e2.yearlySalary());
		e2.setSalary(e2.salary+((e2.salary/100)*10));
		System.out.println("updated salary = " +e2.yearlySalary());
	}

}
