package com.iu.himart;

import java.util.Scanner;

public class Client 
{
	Scanner sc = new Scanner(System.in);
	private int money;
	private int point;
	public Client()
	{
		this.money=30000000;
		this.setPoint(10);
	}
	
	public void MP()
	{
		System.out.println("남은 잔고 : "+money);
		System.out.println("적립 포인트 : "+point);
	}
	
	public void buy(Computer computer)
	{
		this.money=(money-computer.getPrice());
		this.point=(point+computer.getPoint());
		System.out.println("남은 잔고 : "+money);
		System.out.println("적립 포인트 : "+point);
	}
	
	public void buy(Tv tv)
	{
		this.money=(money-tv.getPrice());
		this.point=(point+tv.getPoint());
		System.out.println("남은 잔고 : "+money);
		System.out.println("적립 포인트 : "+point);
	}
	public void buy(Phone phone)
	{
		this.money=(money-phone.getPrice());
		this.point=(point+phone.getPoint());
		System.out.println("남은 잔고 : "+money);
		System.out.println("적립 포인트 : "+point);
	}
	
		
		

		
	
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}

}
