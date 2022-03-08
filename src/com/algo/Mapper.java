package com.algo;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Mapper {

	public static Function<String, CharactersCount> getDistinctCharactersCount() {
		return new Function<String, CharactersCount>() {

			@Override
			public CharactersCount apply(String t) {
				t.chars().mapToObj(e -> (char) e).collect(Collectors.toSet());
				return new CharactersCount(t, t.chars().mapToObj(e -> (char) e).collect(Collectors.toSet()).size());
			}

		};

	}
}
