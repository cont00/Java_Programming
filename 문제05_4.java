package com.java.ch05;

class 문제05_4 {

	public static void main(String[] args) {

		int n = 1;
		int result = 0;
		
		while(n < 100)	{
			result += n;
			n++;
			
		}
		
		System.out.println(result);
		
	}

}

class 문제05_4_2	{
	
	public static void main(String[] args)	{
		
		int i = 1;
		
		do	{
			System.out.println(i);
			i++;
		}	while(i < 100);
		
		while(i > 0)	{
			System.out.println(i);
			i--;
		}
		
	}
	
}

class 문제05_4_3	{
	
	public static void main(String[] args)	{
		
		int i = 0;
		int result = 0;
		
		while((i++) < 1000)	{
			
			if(((i % 2) != 0) || ((i % 7) != 0))
				continue;
			result += i;
			System.out.println(i);
			
		}
		
		System.out.println("2와 7의 배수의 합: " + result);
		
	}
	
}