package com.java8.lambda;
import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {
		long start = System.nanoTime();

		Stream.of("c", "d", "a", "b", "f").sorted().filter(s -> !"d".equals(s))
		.map(s -> s+=s ).
		forEach(System.out::println);

		long end = System.nanoTime();
		System.out.println("Time spent  :" + (end - start) / 1_000_000 + " ms");
	}

}
