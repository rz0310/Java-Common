package com.Oracle.Demo1;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Student();
		Person p2 = new Teacher();
		boolean flag1 = p1 instanceof Student;
		boolean flag2 = p2 instanceof Teacher;
		System.out.println(flag1);
		System.out.println(flag2);
	}

}
