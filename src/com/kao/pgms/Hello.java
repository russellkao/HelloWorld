package com.kao.pgms;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello World");
		printReally();
		Bar bar = new Bar();
		bar.doSomething();
		bar.doSomethingElse();
		Foo foo = new Foo();
		foo.doIt();
		System.out.println("Ralph here");
	}
	private static void printReally() {
		System.out.println("Really!");
	}

}
