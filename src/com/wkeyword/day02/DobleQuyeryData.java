package com.wkeyword.day02;

/*
 * 二叉树去遍历数据
 */

class BiTree {
	private int data;
	private BiTree left;
	private BiTree right;

	public BiTree(int x) {
		// TODO Auto-generated constructor stub
		data = x;
	}

	public void add(BiTree x) {
		if (x.data < this.data) {
			if (left == null) {
				left = x;
			} else {
				left.add(x);
			}
		} else {
			if (right == null) {
				right = x;
			} else {
				right.add(x);
			}
		}
	}

	public void travel() {
		/*
		 * 循环遍历左右数据
		 */
		if (left!=null) {
			left.travel();
		}
		
		System.out.println(data);
		
		if (right!=null) {
			right.travel();
		}
		
	}
}

public class DobleQuyeryData {
	public static void main(String[] args) {
		BiTree t = new BiTree(12);
		t.add(new BiTree(9));
		t.add(new BiTree(5));
		t.add(new BiTree(8));
		t.add(new BiTree(13));
		t.add(new BiTree(14));
		t.add(new BiTree(25));
		t.travel();
	}

}
