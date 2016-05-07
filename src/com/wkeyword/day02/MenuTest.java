package com.wkeyword.day02;

import java.util.List;
import java.util.Scanner;

/*
 * 通用菜单--构造控制台菜单
 * 编程结构思路：
 * 	第一步：创建菜单对象，动态添加菜单数据
 * 	第二步：添加add方法
 * 	第三步：实现运转操作，添加详细的实现逻辑
 * 		1、实现选择跳转
 * 		2、处理异常情况
 * 		3、实现返回上一级的功能
 * 			注意：菜单数据可以变化
 */
public class MenuTest {
	SoTreeTest tree = new SoTreeTest();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuTest m = new MenuTest();
		m.add("水果", "苹果");
		m.add("水果", "香蕉");
		m.add("水果", "葡萄");
		m.add("苹果", "红富士苹果");
		m.add("苹果", "国光苹果");
		m.add("国光苹果", "富强一号");
		m.add("国光苹果", "富强二号");
		String t = m.go("水果");

		System.out.println("您选择：" + t);

	}

	private void add(String parent, String child) {
		// TODO Auto-generated method stub
		tree.add(parent, child);
	}

	private String go(String x) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		for (;;) {

			List<String> lst = tree.getChild(x);
			if (lst.isEmpty()) {
				return x;
			}

			System.out.println("-------------------");
			for (int i = 0; i < lst.size(); i++) {
				System.out.println(i + "..." + lst.get(i));
			}
			System.out.println("u.返回上一级");
			System.out.println("-------------------");
			System.out.println("请输入选择:");
			String s = scan.nextLine();
			if (s.equals("u")) {
				String x1= tree.getParent(x);
				if (x1!=null) {
					x=x1;
				}
				continue;
			}
			try {
				String x1 = lst.get(Integer.parseInt(s));
				x = x1;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("请重新选择");
			}

		}
	}

}
