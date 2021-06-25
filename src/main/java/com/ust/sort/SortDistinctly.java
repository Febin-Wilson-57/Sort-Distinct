package com.ust.sort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SortDistinctly {
	
	public static void main(String[] args) throws IOException{
		

		
		String x = "numberfile.txt";
		ArrayList<Integer> num = new ArrayList<Integer>();
		 num = fileReading(x);
		ArrayList<Integer> result = sort(num);
		System.out.println("The result of operations :" + result);
	}

	public static ArrayList<Integer> fileReading(String x) throws IOException  {
		

		String line;
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		BufferedReader reader = new BufferedReader(new FileReader(x));



		while ((line = reader.readLine()) != null) {

			String[] arr = line.split(" ");

			for (int i = 0; i <= arr.length - 1; i++) {
				try {
					int no = Integer.parseInt(arr[i]);
					numbers.add(no);
				} catch (NumberFormatException nfe) {
					System.out.println("NUMBER FORMAT EXCEPTION");
				}
			}
		}
		return numbers;
	}

	public static ArrayList<Integer> sort(ArrayList<Integer> n) {

		System.out.println("Given input file:" + n);

		final ArrayList<Integer> sortedNumbers = new ArrayList<Integer>();
		n.stream().sorted().distinct().forEach(s -> sortedNumbers.add(s)); 
		System.out.println("The result of operations :" + sortedNumbers);
		return sortedNumbers;

	}

}
