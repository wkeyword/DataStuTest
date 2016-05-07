package com.wkeyword.day01;
/*
 * JAVA会自动匹配
 */
public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new C();
		a.say();
	}

}

class A {
	public void say() {
		System.out.println("a----say");
	}
}

class B extends A {
	public void say() {
		System.out.println("b---say");
	}
}

class C extends B {
	public void sayno() {
		System.out.println("c----");
	}
}
