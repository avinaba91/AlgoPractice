package com.algo;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Solution1 {

	class Mapper {

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

	class Filter {

		public static Predicate<String> nameStartingWithPrefix(String str) {
			return new Predicate<String>() {

				@Override
				public boolean test(String t) {
					return t.startsWith(str);
				}
			};
		}
	}

	/*
	 * Create the Filter and Mapper classes here.
	 */
	class CharactersCount {
		private final String name;
		private final Integer distinctCharacterCount;

		public CharactersCount(String name, Integer distinctCharacterCount) {
			this.name = name;
			this.distinctCharacterCount = distinctCharacterCount;
		}

		@Override
		public String toString() {
			return "\"" + this.name + "\" has " + this.distinctCharacterCount + " distinct characters.";
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		List<String> names = Arrays.asList("aaryanna", "aayanna", "airianna", "alassandra", "allanna", "allannah",
				"allessandra", "allianna", "allyanna", "anastaisa", "anastashia", "anastasia", "annabella", "annabelle",
				"annebelle");

		names.stream().filter(Filter.nameStartingWithPrefix(scanner.nextLine()))
				.map(Mapper.getDistinctCharactersCount()).forEachOrdered(System.out::println);
	}
}