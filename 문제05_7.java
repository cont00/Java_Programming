package com.java.ch05;

class 문제05_7 {

	public static void main(String[] args) {

		for(int i = 1; i < 10; i++)	{
			if((i % 2) == 0)	{	
				for(int j = 1; j <= i; j++)	{
					System.out.println(i + " x " + j + " = " + i * j);
				}
			}
			System.out.println();
		}

	}

}

class 문제05_7_2	{
	
	public static void main(String[] args)	{
		
		int result = 0;
		
		for(int A = 0; A < 10; A++)	{
			for(int B = 0; B < 10; B++)	{
				if(A == B)	{
					continue;
				}
				
				result = (A * 10 + B) + (B * 10 + A);
				if(result == 99)	{
					System.out.println("" + A + B + " + " + B + A + " = " + result);
				}
			}
		}
		
	}
	
}