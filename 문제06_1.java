package com.java.ch06;

class 문제06_1 {

	public static void main(String[] args) {

		addMthod(12, 7);
	}
	
	public static void addMthod(int a, int b)	{
		
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b));
		System.out.println("몫: " + (a / b));
		System.out.println("나머지: " + (a % b));
	}

}

class 문제06_1_2	{
	
	public static void main(String[] args)	{
		
		System.out.println(absMthod(4, 9));
		
	}
	
	public static int absMthod(int a, int b)	{
		
		int absResult;
		
		absResult = a - b;
		if(absResult < 0)	{
			absResult = absResult - (absResult * 2);
			return absResult;
		}
		else
			return absResult;
	}
}