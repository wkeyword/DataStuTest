package com.wkeyword.day03;

import java.io.BufferedWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a={"zhang","wang","li","wu","fu"};
		String[] b={"zhang,数学,88","zhang,语文,89","zhang,英语,89","wu,数学,99","wu,英语,66","tang,数学,77"};
		/*
		 * 需求：求哪些同学所有科目都缺考
		 */
		
		Set<String> sa=new HashSet<String>();
		for(int i=0;i<a.length;i++){
			sa.add(a[i]);
		}
		Set<String> sb=new HashSet<String>();
		for(int i=0;i<b.length;i++){
			sb.add(b[i].split(",")[0]);//分解得到第一项的学生姓名数据
		}
		
		sa.removeAll(sb);//求差集的做法是用removeAll
		
		System.out.println(sa);
		
		/*
		 * 面临的问题是无法去使用List的遍历操作
		 * 这时候可以使用JAVA的枚举器来遍历数据，Iterator
		 */
		Iterator<String> it=sa.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
