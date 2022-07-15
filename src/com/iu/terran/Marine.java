package com.iu.terran;
import com.iu.unit.Attacker;
import com.iu.unit.Unit;

public class Marine extends Unit implements Attacker
{
	
	
	private String weapon;
	
	public Marine ()
	{
		/*super(30);*/
		System.out.println("Marin 생성자");
	}
	
	
//	public void shoot()
//	{
//		System.out.println("우다다다");
//	}
	
	
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	public void move() {
		System.out.println("뛰어다님");
	}

	public void info() {
		super.info();
		System.out.println("Marine Info");
	}


	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
}
