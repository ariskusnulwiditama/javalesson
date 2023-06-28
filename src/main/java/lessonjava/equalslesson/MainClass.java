package lessonjava.equalslesson;

public class MainClass {
	public static void main(String[] args) {
		Person ob1 = new Person("Michael", 34);
		Person ob2 = new Person("Michael", 34);
		
		System.out.println(ob1.equals(ob2));
	}
}
