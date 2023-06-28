package lessonjava.array;

import java.util.Arrays;

public class ArrayLesson {
	
	public void arrayLesson() {
		String[] name = new String[9];
		name[0] = "zero";
		name[1] = "one";
		name[2] = "two";
		name[3] = "three";	
		System.out.println(Arrays.toString(name));
		for (String el : name) {
			System.out.println(el);
		}
		
		int[] num = new int[] {
				12,44,66,12
		};
		
		System.out.println(Arrays.toString(num));
	}
}
