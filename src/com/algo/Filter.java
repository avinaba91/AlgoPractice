package com.algo;
import java.util.function.Predicate;

public class Filter {

	public static Predicate<String> nameStartingWithPrefix (String str) {
		return new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.startsWith(str);
			}
		};
	}
}
