package com.assignments.ques4;

public class UsingPeople {

	public static void main(String[] args) {
		Address a1=new Address("17/13/7","krishna nagar","rjy","533101");
		TechnicalEmployee t1=new TechnicalEmployee(123,"Chakradhar",a1,50000d,2,"c,c++");
		t1.calculateSalary();
		System.out.println(t1);
		Address a2=new Address("17/16/1","Vinayaka nagar","Kkd","511101");
		Staff s1=new Staff("House Keeping",612,"Prudhvi",a2,25000d,5);
		s1.calculateSalary();
		System.out.println(s1);
	}

}
