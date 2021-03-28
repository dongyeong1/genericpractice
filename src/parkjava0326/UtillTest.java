package parkjava0326;

import java.util.Arrays;

public class UtillTest {

	public static void main(String[] args) {
		Integer[] arr = {3,4,5,6,7,8,9,20};
		
//		Student[] arr = {new Student("°¡", 78),
//						new Student("³ª", 75),
//						new Student("´Ù", 71)};
//		
		System.out.println(Utill.getmax(arr));
		Utill.println(arr);
		
		Utill.printValueof5times(12);
		Utill.printsum(Arrays.asList(arr));;
	
	}

}
