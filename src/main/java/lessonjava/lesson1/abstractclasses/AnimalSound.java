package lessonjava.lesson1.abstractclasses;

public abstract class AnimalSound {
	public abstract void sound();
	
	protected void sleep() {
		System.out.println("animal sleep");
	}
}
