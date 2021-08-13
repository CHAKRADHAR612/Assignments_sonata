package com.assignments.ques1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EmployeeImpl implements EmployeeInt {
	List<Employee> list=new LinkedList<>();
	@Override
	public void addEmployee(Employee e) {
		list.add(e);
	}

	@Override
	public void deleteEmployee(Employee e) {
		list.remove(e);
	}

	@Override
	public double yearSalary(Employee e) {
		double yearSal=e.getEmpSal()*12;
		return yearSal;
	}

	@Override
	public double appSalary(Employee e) {
		double appSal=e.getEmpSal();
		if(e.getEmpSal()<10000) {
			appSal=e.getEmpSal()+5000;
			e.setEmpSal(e.getEmpSal()+5000);
		}
		System.out.println("Salary incremented by 5000");
		return appSal;
	}
	public List<Employee> getEmployee(){
		Collections.sort(list);
		return list;
	}

}
