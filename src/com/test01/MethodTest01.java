package com.test01;

public class MethodTest01 {
	public static void main(String[] args) {
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		MethodTest01.privateMethod();
		
		MethodTest01 test = new MethodTest01();
		test.NonStaticMethod();
	}
	//접근 제한자(public(+), protected(#), default(default), private(-))
	public static void publicMethod() {
		System.out.println("public method"); //어디서나 사용 가능.
	}
	protected static void protectedMethod() {
		System.out.println("protected method"); //상속일 경후 상솓된 곳에서 \상속이 아닌 경우 패키지 내에서
	}
	static void defaultMethod() {
		System.out.println("default method"); //같은 패키지 내에서
	}
	private static void privateMethod() {
		System.out.println("private method"); //현재 클래스 내에서만
	}
	
	public void NonStaticMethod(){
		System.out.println("non static method");
	}
}
