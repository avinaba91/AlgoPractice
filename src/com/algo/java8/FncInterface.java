package com.algo.java8;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FncInterface {
	
	@FunctionalInterface
	interface FncInf1 {
		
		void operation (int a, int b);
	}

	public static void main(String[] args) {
		FncInf1 f1 = (a,b) -> System.out.println("Multiplication is : " + a*b);
		FncInf1 f2 = (a,b) -> System.out.println("Add is : " + (a+b));
		Predicate<Integer> pred1 = (i)-> (i > 200);
		f1.operation(10, 20);
		f2.operation(30, 40);
		System.out.println(pred1.test(999));
		Consumer<String> consumer = (input) -> System.out.println(input);
		consumer.accept("consumer 1");
		BiFunction<Integer, Integer, Float> func1 = (a,b)-> a/b.floatValue();
		System.out.println(func1.apply(15, 20));
		Supplier<Integer> sup1 = ()-> 10;
		System.out.println(sup1.get());

	}

}
