package com.sonata;

public class DuplicateValues {

	public static void main(String[] args) {
		int[]arr= {1,4,4,5,1,5,2,3,8,9};
		int j=0;
		while(j<arr.length) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
			}
			j++;
		}
		for(int i=0;i<arr.length-2;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i]);
			}
			if(arr[i]==arr[i+2]) {
				continue;
			}
		}
	}

}
