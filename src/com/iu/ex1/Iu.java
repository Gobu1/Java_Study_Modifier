package com.iu.ex1;

public class Iu 
{
	private String name;
	private int age;
	
	//fix_study
	private String test;
	
	private static Iu iu=null;
	
	//Setter
	//public void set변수명(데이터타입 변수명){}
	//Getter
	//public 리턴타임 get변수명(){}
	
	private Iu() {} //생산자
	public static Iu getInstance()
	{
		if(Iu.iu ==null) 
		{
			Iu.iu = new Iu();
		} 
		return Iu.iu;
	}
	
	
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public int getAge() 
	{
		return age;
	}
}
