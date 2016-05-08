package com.wkeyword.day03;

import java.util.ArrayList;
import java.util.List;

/*
 * 动态数据操作起来很方便
 */
public class MyA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = new ArrayList<String>();
		lst.add("abc");
		lst.add("xyz");
		lst.add("ttt");
		lst.add("abc");
		lst.add("dog");
		lst.add("dog");
		lst.add("dog");
		lst.add("dog");
		lst.add("cat");
		System.out.println(lst);
		for (int i = 0; i < lst.size(); i++) {
			int j = lst.lastIndexOf(lst.get(i));
			if (i != j) {
				lst.remove(j);
				i--;
			}
		}
		System.out.println(lst);

	}

}
