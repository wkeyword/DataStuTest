package com.wkeyword.day03;

import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable{
	private String name;
	private int age;

	public Student(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Student ==false) {
			return 0;
		}
		Student p=(Student) o;
		int t = this.name.compareTo(p.name);
		if (t!=0) {
			return t;
		}
		
		return this.age-p.age;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+":"+age;
	}
}

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set<String> a = new TreeSet<String>();
//
//		a.add("abc");
//		a.add("xyz");
//		a.add("abc");
//		
//		
//		System.out.println(a);
		
		Set<Student> a=new TreeSet<Student>();
		a.add(new Student("hao", 10));
		a.add(new Student("hao", 20));
		a.add(new Student("hao", 30));
		a.add(new Student("hao", 10));
		a.add(new Student("zhang", 10));
		a.add(new Student("zhang", 11));
		a.add(new Student("zhang", 11));
		a.add(new Student("zhang", 20));
		a.add(new Student("li", 40));
		System.out.println(a);
		
	}

}
