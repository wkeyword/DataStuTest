package com.wkeyword.day01;

public class AA {
	public static void main(String[] args) {
//		String s="";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<100;i++){
//			s=s+i;
			sb.append(i);
		}
		String s=sb.toString();
		System.out.println(s);
	}
}
