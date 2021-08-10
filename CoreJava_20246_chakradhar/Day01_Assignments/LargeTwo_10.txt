package com.sonata;

public class LargeTwo {

	public static void main(String[] args) {
		int[]arr= {10,34,45,76,22};
		int lastUnsortedIndex=arr.length-1;
		int largest1=0;
		while(lastUnsortedIndex>0) {
		for(int i=1;i<=lastUnsortedIndex;i++) {
			if(arr[largest1]<arr[i]) {
				largest1=i;
			}
			if(i==lastUnsortedIndex) {
				int temp=arr[largest1];
				arr[largest1]=arr[i];
				arr[i]=temp;
				lastUnsortedIndex--;
				largest1=0;
			}
		}
		}
			System.out.println(arr[arr.length-1]+" "+arr[arr.length-2]);
	}

}
