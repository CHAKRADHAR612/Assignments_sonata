package com.assignments.ques1;

import java.util.List;

public class UserEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"chakri",50000);
		Employee e2=new Employee(2,"prudhvi",30000);
		Employee e3=new Employee(1,"chandra",60000);
		Employee e4=new Employee(3,"sri",6000);
		EmployeeImpl el=new EmployeeImpl();
		el.addEmployee(e1);
		el.addEmployee(e2);
		el.addEmployee(e3);
		el.addEmployee(e4);
		List<Employee> list=el.getEmployee();
		for(Employee e:list) {
			System.out.println(e);
		}
		System.out.println("Employee "+e1.getEmpName()+"'s yearly salary:"+el.yearSalary(e1));
		System.out.println("Employee "+e2.getEmpName()+"'s yearly salary:"+el.yearSalary(e2));
		System.out.println("Employee "+e3.getEmpName()+"'s yearly salary:"+el.yearSalary(e3));
		System.out.println("Employee "+e4.getEmpName()+"'s updated salary:"+el.appSalary(e4));
		System.out.println("Employee "+e4.getEmpName()+"'s yearly salary:"+el.yearSalary(e4));
		
		
		
	}

}
