package com.ust.test;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ust.sort.SortDistinctly;

public class SortDistinctlyTest {

	private SortDistinctly obj = new SortDistinctly();
	String line;
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	ArrayList<Integer> n = new ArrayList<Integer>();

	@Test
	public void inputFile() throws IOException {

		n = obj.fileReading("numberfile.txt");
		Assertions.assertEquals(n, obj.fileReading("numberfile.txt"));

	}

	@Test
	public void finalResult() throws IOException {

		numbers = obj.fileReading("numberfile.txt");

		final ArrayList<Integer> sortedNumbers = new ArrayList<Integer>();

		numbers.stream().sorted().distinct().forEach(s -> sortedNumbers.add(s));

		Assertions.assertEquals(sortedNumbers, obj.sort(numbers));

	}
}
