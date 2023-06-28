package lessonjava.lesson1;

import lessonjava.lesson1.abstractclasses.AnimalSound;
import lessonjava.lesson1.interfaces.Animal;

public class Dog extends AnimalSound implements Animal{

	@Override
	public void sound() {
		System.out.println("bark bark");
	}

	@Override
	public void sleep() {
		System.out.println("dog sleep zzz");
	}
}
