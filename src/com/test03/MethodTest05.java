package com.test03;

public class MethodTest05 {
	public static void main(String[] args) {
		MethodTest05 type = new MethodTest05();
		int num = type.test();
		System.out.println(num);
		System.out.println(type.test3());
		System.out.println(type.test4(3));
	}
	public int test() {
		
		int no = 10 + 20;
		System.out.println("test()실행..");
		return no+1;
	}
	public double test2() {
		return 10.1;
	}
	public String test3() {
		return "빵";
	}
	public int test4(int i) { //int i : 매개변수
		return 11 + i;
	}
}
