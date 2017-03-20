package com.david.streams;

import java.util.Arrays;
import java.util.List;

public class StreamTest {

	private List<String> peopleArray = Arrays.asList("david", "kevin", "john", "eoin", "linda", "sophie", "meg", "dan", "debbie" );
	private int[] numArray = {12,3,45,6789,123,45,69,87,6,543,2,132,5,41,5,5,5,5,67,984,6,51};
	
	public static void main(String[] args) {
		new StreamTest().testStream();
	}
	
	public void testStream(){
		//skip first 10 ints and return the unique ints left
		int[] resultArray = Arrays.stream(numArray).skip(10).distinct().toArray();
		
		//perform stream operation on list of strings to (1)filter names beginning with "d", (2)store them in a map while changing them to uppercase, (3)sort & (4)then print
		peopleArray
			.stream()
			.filter(s -> s.startsWith("d"))
			.map(String::toUpperCase)
			.sorted()
			.forEach(System.out::println);
	}

}
