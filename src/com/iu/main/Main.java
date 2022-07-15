package com.iu.main;
import com.iu.terran.Marine;
import com.iu.terran.Scv;
import com.iu.unit.Unit;
import com.iu.zerg.Hydra;

public class Main 
{

	public static void main(String[] args) 
	{
		Marine m1 = new Marine();
		Scv s1 = new Scv();
		Unit unit = m1;
		Hydra hydra = new Hydra();
		
		//Marine is a Unit
		//Scv	 is a Unit
//		m1.setHp(30);
//		m1.setColor(null);
		//Unit unit = new Unit();
		
		m1.attack();
		hydra.attack();
		
		
		
//		System.out.println(unit.getHp());
//		System.out.println(unit.getColor());
//		System.out.println(unit.getName());
//		
//		m1=(Marine)unit;
//		System.out.println(m1.getWeapon());
//		
	}

}
