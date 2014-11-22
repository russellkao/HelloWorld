package com.kao.pgms;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello World");
		printFoo();
		Bar bar = new Bar();
		bar.doSomething();
	}
	private static void printFoo() {
		System.out.println("Foo");
	}

}
