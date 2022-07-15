package com.iu.himart;

public class Computer extends Product
{
	private String cpu="10800";
	public Computer ()
	{
		this.setBrand("한성");
		this.setPrice(1500000);
		this.setPoint(getPrice()/100);
	}

	
	public void info()
	{
		System.out.println("cpu : "+cpu);
		System.out.println("브랜드 : "+getBrand());
		System.out.println("가격 : "+getPrice());
		System.out.println("포인트 : "+getPoint());
		
	}
	
	
}
