package com.java.ch05;

class 문제05_5 {

	public static void main(String[] args) {
		
		int result = 1;
		
		for(int i = 1; i<10; i++)	{
			result = result * i;
			System.out.println(result);
		}
		
	}

}

class 문제05_5_2	{
	
	public static void main(String[] args)	{
	
		for(int i = 1; i < 10; i++)	{
			if(i == 5)	{
				for(int j = 2; j < 10; j++)	{
					System.out.println(i + " x " + j + " = " + i * j);
				}
			}
		}
		
	}
	
}