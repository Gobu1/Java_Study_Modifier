package com.iu.util;

public class CollectionQue implements Collection
{
	int []nums;

	public int[] add(int[] numbers) 
	{
		nums = new int [numbers.length+1];
		for (int i=0; i<numbers.length; i++)
		{
			nums[i+1]=numbers[i];
		}
		nums[0]=numbers.length+1;
		numbers=nums;
		for (int i=0; i<numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
		return numbers;
	}

	
	public int[] remove(int[] numbers) {
		
		return null;
	}
	
}
