package com.sonata;

public class OvalReplace {

	public static void main(String[] args) {
		String s="chakradhar hello";
		char[] ch=s.toCharArray();
		String s1=new String();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				ch[i]='$';
			}
			s1+=ch[i];
		}
		System.out.println(s1);
	}

}
