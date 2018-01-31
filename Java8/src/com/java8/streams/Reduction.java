package com.java8.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Reduction {

	public static void main(String[] args) {
		List<Integer> userNameList = Arrays.asList(2, 5, 6);

		int total =userNameList.stream().reduce(1,(a,b)->a+b);
		System.out.println("Total : "+ total);
		
	}

}
