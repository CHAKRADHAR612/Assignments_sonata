package com.sonata;

public class SpecificValue {

	public static void main(String[] args) {
		boolean flag=false;
		int[]arr= {1,2,3,4,5};
		int r=2;
		for(int i=0;i<arr.length;i++) {
			if(r==arr[i]) {
				System.out.println("number is at:"+i+" index");
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Element not found");
		}
	}

}
