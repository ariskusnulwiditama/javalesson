package lessonjava.lesson1;

import lessonjava.lesson1.abstractclasses.AnimalSound;
import lessonjava.lesson1.interfaces.Animal;

public class Cat extends AnimalSound implements Animal{

	@Override
	public void sound() {
		System.out.println("meowww");
	}
	
	@Override
	protected void sleep() {
		// TODO Auto-generated method stub
		System.out.println("cat sleep zzz");
	}
}
