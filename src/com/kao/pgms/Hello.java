package com.kao.pgms;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello World");
		printReally();
		Bar bar = new Bar();
		bar.doSomething();
		Foo foo = new Foo();
		foo.doIt();
	}
	private static void printReally() {
		System.out.println("Really!");
	}

}
