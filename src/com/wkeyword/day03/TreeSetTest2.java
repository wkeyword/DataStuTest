package com.wkeyword.day03;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person{
	private String name;
	private int age;

	public Person(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+":"+age;
	}
}

class K implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if (o1 instanceof Person ==false || o2 instanceof Person ==false) {
			return 0;
		}
	
		Person p1=(Person) o1;
		Person p2=(Person) o2;
		int t=p1.getName().compareTo(p2.getName());
		if (t!=0) {
			return t;
		}
//		return p1.getAge()-p2.getAge();
		return p2.getAge()-p1.getAge();//可以控制实现输出的顺序
	}
	
}

public class TreeSetTest2 {

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
		
		Set<Person> a=new TreeSet<Person>(new K());
		a.add(new Person("hao", 10));
		a.add(new Person("hao", 20));
		a.add(new Person("hao", 30));
		a.add(new Person("hao", 10));
		a.add(new Person("zhang", 10));
		a.add(new Person("zhang", 11));
		a.add(new Person("zhang", 11));
		a.add(new Person("zhang", 20));
		a.add(new Person("li", 40));
		System.out.println(a);
		
	}

}
