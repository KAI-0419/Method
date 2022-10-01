package com.test03;

public class MethodTest04 {
	public static void main(String[] args) {
		MethodTest04 mt04 = new MethodTest04();
//		mt04.methodA();
//		mt04.methodB();
//		mt04.methodC();
		
		mt04.methodA();
	}
	public void methodA() {
		System.out.println("methodA() 호출..");
		methodB();
	}
	public void methodB() {
		System.out.println("methodB() 호출..");
		methodC();
	}
	public void methodC() {
		System.out.println("methodC() 호출..");
	}
}
