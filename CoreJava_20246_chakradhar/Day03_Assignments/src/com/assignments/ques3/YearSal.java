package com.assignments.ques3;

public class YearSal {

	public void yearSal(int n) {
		try {			
			if(n<100000) {
				throw new YearException("Yearly salary cannot be less than 100000");
			}
			else {
				System.out.println("Yearly salary accepted");
			}
		}catch(YearException y) {
			System.out.println(y);
		}
	}
	public static void main(String[] args) {
		YearSal y1=new YearSal();
		y1.yearSal(500000);
	}

}
