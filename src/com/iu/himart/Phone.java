package com.iu.himart;

public class Phone extends himart
{
	private String product="삼성";
	public Phone ()
	{
		this.setBrand("갤럭시");
		this.setPrice(1000000);
		this.setPoint(getPrice()/50);
	}

	
	public void info()
	{
		System.out.println("제조회사 : "+product);
		System.out.println("브랜드 : "+getBrand());
		System.out.println("가격 : "+getPrice());
		System.out.println("포인트 : "+getPoint());
		
	}

}
