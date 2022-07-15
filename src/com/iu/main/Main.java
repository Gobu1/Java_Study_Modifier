package com.iu.main;

import org.xml.sax.HandlerBase;

import com.iu.animal.Cat;
import com.iu.animal.Human;
import com.iu.animal.Zoo;

public class Main 
{

	public static void main(String[] args) 
	{
//		Cat cat = new Cat();
//		cat.sound();
//		//cat.age=5; - 다른패키지 접근불가
		Human human = new Human();
		//human.age=500;
		human.setAge(110);
		human.info();
		Zoo zoo = new Zoo();
		//zoo.price=100000;
		//==================================
		System.out.println(Zoo.title);
		System.out.println(zoo.PRICE);
		Zoo.info();
				
		
	}

}
