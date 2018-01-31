package com.java8.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Collector {

	public static void main(String[] args) {
		List<String> userNameList = Arrays.asList("Vijay", "Arun", "Vikas");
		userNameList.stream().map(s -> s.substring(0, 3)).filter(s-> s.startsWith("V"))
							.forEach(System.out::println);
		
		List<String> transformedList=userNameList.stream().map(s -> s.substring(0, 3)).
				filter(s-> s.startsWith("V")).collect(Collectors.toList());
		transformedList.forEach(System.out::println);
		
	}

}
