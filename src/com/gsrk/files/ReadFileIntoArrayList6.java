package com.gsrk.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFileIntoArrayList6 {

	public static void main(String[] args) {
		// reading text file into ArrayList in Java 6
		
		ArrayList<String> listOfLines = new ArrayList<>();
		String line;
		try {
			BufferedReader bufReader = new BufferedReader(new FileReader("C:/Users/gsrkr/Documents/dev/JavaExamples/src/com/gsrk/files/files.txt"));
			line = bufReader.readLine();
			while (line != null) {
				listOfLines.add(line);
				line = bufReader.readLine();
			}
			bufReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Content of ArrayLiList:");
		System.out.println(listOfLines);
		List<String> lines7Split = new ArrayList<String>();
		for (String str : listOfLines) {
			if (str != null) {
				String[] stringArr = str.split(" ");
				lines7Split.addAll(Arrays.asList(stringArr));
			}
		}
		System.out.println("lines7 Split:" + lines7Split);
		System.out.println(lines7Split.contains("Adventures"));

	}
}
