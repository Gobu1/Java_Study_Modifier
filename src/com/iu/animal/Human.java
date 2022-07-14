package com.iu.animal;

public class Human 
{
	private int age;
	
	//데이터를 private 변수에 대입하는 메서드
	//set 변수명 : 변수명 첫글자 대문자
	//데이터를 private 변수에 반환하는 메서드
	//get 변수명 : 변수명 첫글자 대문자
	public int getAge()
	{
		return this.age;
	}
	
	public void setAge(int age)
	{
		if(age>0 && age<150)
		{
			this.age=age;
		}
		else 
		{
			this.age=0;
		}
	}
	
	public void info() 
	{
		System.out.println(this.age);
	}
	
	
	public void myPet()
	{
		Cat cat = new Cat();
		//cat.age=10;
		//cat.sound();
	}

}
