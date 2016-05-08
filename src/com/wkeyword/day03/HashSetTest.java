package com.wkeyword.day03;

import java.util.HashSet;
import java.util.Set;


class Man{
	private String name;
	private int age;
	
	public Man(String name,int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+":"+age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Man==false) {
			return false;
		}
		
		Man p=(Man)obj;
		return this.name.equals(p.name) && this.age==p.age;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
//		return 100;
		//[zhang:10]
		
		return this.name.hashCode()+age;

	}
}
public class HashSetTest {

	public static void main(String[] args) {
		
//		/*
//		 * 判断重复的方式不是比较两个对象的地址，而是使用的是逻辑比较
//		 */
//		// TODO Auto-generated method stub
//		Set<String> a=new HashSet<String>();
//		a.add("xyz");
//		a.add("abc");
//		a.add("xyz");
//		a.add(new String("abc"));
//		System.out.println(a);
		Set<Man> a=new HashSet<Man>();
		a.add(new Man("zhang", 10));
		a.add(new Man("zhang", 11));
		a.add(new Man("zhang", 10));
		a.add(new Man("li", 10));
		System.out.println(a);
		//[zhang:10, li:10, zhang:10, zhang:11]  调用equals方法
		
	}

}
