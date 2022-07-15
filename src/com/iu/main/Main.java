package com.iu.main;

import com.iu.util.CollectionStack;

public class Main 
{
	public static void main(String []args)
	{
		int [] numbers = {1, 2, 3};
		CollectionStack cs = new CollectionStack();
		//1. com.iu.util.CollectionStack
		//add - 새로운 숫자 추가 무조건 0번에 추가
		//remove - 0번 인덱스 삭제
		
		//2. com.iu.util.CollectionQue
		//add - 새로운 숫자 추가 무조건0번에 추가
		//remove - 마지막 인덱스 삭제
		
		//3. com.iu.util.CollectionSet
		//add - 새로운 숫자 추가 맨뒤에 추가(단 중복되지 않는 숫자만 추가)
		//remove - 삭제할 숫자를 입력받아서 일치하는 숫자를 삭제
		cs.add(numbers);
		System.out.println(numbers);
		
	}

}
