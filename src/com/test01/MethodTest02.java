package com.test01;

public class MethodTest02 {
	public static void main(String[] args) {
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
//		MethodTest01.privateMethod();
		
		MethodTest01 mt = new MethodTest01();
		mt.NonStaticMethod();
	}
	
}
