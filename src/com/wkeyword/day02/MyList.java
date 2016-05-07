package com.wkeyword.day02;
/*
 * 单链表的练习例子
 */
class seltList {
	private int data;// 定义数据
	private seltList next;// 指向下一个数据的指针

	public seltList(int x) {
		// TODO Auto-generated constructor stub
		data = x;
	}

	/*
	 * 链表的添加
	 */
	public void add(seltList x) {
		x.next = next;
		next = x;

	}

	/*
	 * 链表的追加
	 */
	public void append(seltList x) {
		seltList p = this;
		while (p.next != null) {
			p = p.next;
		}
		p.next = x;
	}

	/*
	 * 链表的显示
	 */
	public void show() {
		seltList p = this;
		while (p != null) {
			System.out.println(p.data);
			p = p.next;
		}
	}

}

public class MyList {
	public static void main(String[] args) {
		seltList head = new seltList(10);
		head.append(new seltList(30));
		head.append(new seltList(40));
		head.append(new seltList(50));
		head.add(new seltList(20));
		head.show();

	}
}
