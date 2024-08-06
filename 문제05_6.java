package com.java.ch05;

class 문제05_6 {

	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 1; i < 100; i++)	{
			if(((i % 5) != 0) || ((i % 7) != 0))
				continue;
			count++;
			System.out.println(i);
		}
		
		System.out.println("count: " + count);

	}

}

class 문제05_6_2	{
	
	public static void main(String[] args)	{
	
		int result = 0;
		
		for(int i = 0; i < 1000; i++)	{
			if((i % 2) != 0)	{
				result += i;
			}
			
			if(result >= 1000)	{
				System.out.println("1000을 넘은건 몇 번 째 합인가? " + i + " 번 째");
				System.out.println("1000을 넘어선 값: " + result);
				break;
			}
		}
		
	}
	
}