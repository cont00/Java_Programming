package com.java.ch06;

class 문제06_2 {

	public static void main(String[] args) {

		System.out.println(circleArea(5));
		System.out.println(circlePerimeter(5));

	}

	public static double circleArea(double a)	{
		return a = a * a * 3.14;
	}
	
	public static double circlePerimeter(double a)	{
		return a = a * 2 * 3.14;
	}
	
}

class 문제06_2_1	{
	
	public static void main(String[] args)	{
		
		primeNumber(20);
		
	}
	
	public static void primeNumber(int num)	{
		
		boolean prime;
		
		for(int i = 1; i <= num; i++)	{
			int count = 0;
			
			for(int j = 1; j <= i; j++) {
				if(i % j == 0)	{
					count++;
				}
			}
			
			if(count == 2)	{	
				prime = true;
				System.out.println(i + " = " + prime);
			}
			
			else	{
				prime = false;
				System.out.println(i + " = " + prime);
			}
		}
		
	}
	
}