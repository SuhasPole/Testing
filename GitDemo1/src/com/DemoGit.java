package com;

import com.change.Change;

public class DemoGit extends Change{
	
	
	public static void add(){
		
		int a=3, b=5;
		int c = a + b;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HellO");
		System.out.println("Git Demo");
		
		DemoGit d = new DemoGit();
		
		d.m1();
		d.m2();
		d.m3();
		add();
	}

}
