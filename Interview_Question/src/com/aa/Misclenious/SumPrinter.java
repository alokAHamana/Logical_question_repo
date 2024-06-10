package com.aa.Misclenious;

@FunctionalInterface
public interface SumPrinter {
	void printSum(int a, int b);
}

class PrintSum {

	public static void main(String[] args) {
		SumPrinter sumPrinter = (a, b) -> System.out.println("The sum of " + a + " and " + b + " is: " + (a + b));

		int num1 = 10;
		int num2 = 20;
		sumPrinter.printSum(num1, num2);
	}
}
