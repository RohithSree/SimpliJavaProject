package com.javaprograms;

public class AbstractCatClass extends AbstractAnimal {

	@Override
	public void Speak() {
		
		System.out.println("Cat say Meow");
	}

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String args[])
	{
		
		AbstractCatClass Eugene  = new AbstractCatClass();
		Eugene.Speak();
	}

}
