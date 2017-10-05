package com.gsrk.files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReadFileIntoArrayList7 {
	public static void main(String[] args) {
		List<String> lines7 = Collections.emptyList();
		try {
			lines7 = Files.readAllLines(Paths.get("files.txt"), StandardCharsets.UTF_8);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		System.out.println("lines7:" + lines7);
		List<String> lines7Split = new ArrayList<String>();
		for (String str : lines7) {
			if (str != null) {
				String[] stringArr = str.split(" ");
				lines7Split.addAll(Arrays.asList(stringArr));
			}
		}
		System.out.println("lines7 Split:" + lines7Split);
		System.out.println(lines7Split.contains("Adventures"));
	}
	
	
}
