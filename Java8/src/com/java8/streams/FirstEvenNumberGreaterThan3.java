package com.java8.streams;

import java.util.Arrays;
import java.util.List;

public class FirstEvenNumberGreaterThan3 {
	
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,5);
		
		int result=list.stream().filter(i-> i>3).filter(i-> i%2==0).findFirst().get();
		
		System.out.println(result);
		
		
	}

}
