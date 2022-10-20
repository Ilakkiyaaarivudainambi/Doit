package teleapps;

import java.util.Scanner;

public class Arithmetic extends Thread {
	public void run() {
		meth(5, 10);
	}

	static void meth(int a, int b) {
		int c = a + b;
		System.out.println("Addition : " + c);
	}

}

class Subtraction extends Thread {
	public void run() {
		meth(5, 10);
	}

	static void meth(int a, int b) {
		int c = a - b;
		System.out.println("Subtraction : " + c);
	}
}

class Multiplication extends Thread {
	public void run() {
		meth(5, 10);
	}

	static void meth(int a, int b) {
		int c = a * b;
		System.out.println("Muliplication : " + c);
	}

}

class Division extends Thread {
	public void run() {
		meth(5, 10);
	}

	static void meth(int a, int b) {
		int c = a / b;
		System.out.println("Division : " + c);
	}
}
