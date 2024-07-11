package com.rajalakshmi.assignment;

public class employees extends manager {

	private String name;
	private int employeeid;
	private int salary;
	public String getName() {
		return name;
		}
		public void setName(String name) {
		this.name = name;
		}
	public int getEmployeeid() {
		return employeeid;
			}
		public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
		}
	public int getSalary() {
		return salary;
		}
		public void setSalary(int salary) {
		this.salary = salary;	
		}
@Override
public String toString()
{
    		return "employee [Name=" + name + ", Employee's ID=" + employeeid + ", Salary=" + salary + "Field=\" + field + \", position=\" + position +]";
}


}



