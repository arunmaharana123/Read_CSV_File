package com.arun;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ReadCSVFile {

	// local CSV files path
	private static String localFilePathToCSV = "src/sample.csv";

	// Note if CSV file texts are separated by comma (,)
	// change separator if any other separator is using in CSV file
	private static String separator = ",";

	public static void main(String[] args) {
		try {
			Path path = Paths.get(localFilePathToCSV);
			try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.US_ASCII)) {
				String line = reader.readLine();

				// read lines till last
				while (line != null) {
					String[] words = line.split(separator);
					System.out.println(Arrays.asList(words));
					line = reader.readLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}