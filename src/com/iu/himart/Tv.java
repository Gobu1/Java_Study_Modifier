package com.iu.himart;

public class Tv extends Product
{
	private String size="조텍";
	public Tv ()
	{
		this.setBrand("LG");
		this.setPrice(8000000);
		this.setPoint(getPrice()/300);
	}

	
	public void info()
	{
		System.out.println("사이즈 : "+size);
		System.out.println("브랜드 : "+getBrand());
		System.out.println("가격 : "+getPrice());
		System.out.println("포인트 : "+getPoint());
		
	}

}
