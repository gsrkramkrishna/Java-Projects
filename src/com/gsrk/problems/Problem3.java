package com.gsrk.problems;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Problem3 {
	public static final String INPUT_FILE_NAME="C:/Users/gsrkr/Documents/dev/JavaExamples/src/com/gsrk/problems/input.txt";
	public static final String OUTPUT_FILE_NAME="C:/Users/gsrkr/Documents/dev/JavaExamples/src/com/gsrk/problems/output.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process(INPUT_FILE_NAME);
	}
	public static void process(String fileName){
		List<String> studentMarksList = read(fileName);
		processData(studentMarksList);
	}
	public static void processData(List<String> studentMarksList){
		Map<String,Student> map = new HashMap<String,Student>();
		try{
			for(int i=0;i<studentMarksList.size();i++){
				String[] studentsArr = splitString(studentMarksList.get(i));
				if(studentsArr.length >4){
					throw new IOException();
				}
				Student st = new Student(new Integer(studentsArr[0]), studentsArr[1], new Integer(studentsArr[2]));
				if(map.containsKey(studentsArr[1])){
					Student tempStudent = map.get(studentsArr[1]);
					if(st.getMarks()>tempStudent.getMarks())
						map.put(studentsArr[1], st);
				}else{
					map.put(studentsArr[1], st);
				}
			}
			write(map);
		}catch(NumberFormatException nfe){
			System.out.println("Unable to Parse data");
			nfe.printStackTrace();
		}
		catch(IOException ie){
			System.out.println("Unable to Parse the data");
			ie.printStackTrace();
		}
		
		
	}
	public static List<String> read(String fileName) {

		String line = null;
		List<String> studentMarksList = new ArrayList<String>();
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				studentMarksList.add(line);
			}
		} catch (IOException ie) {
			System.out.println("Unable to Parse the input.txt file");
			ie.printStackTrace();
		}finally{
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				System.out.println("Unable to close the streams at the time Parsing the input.txt file");
				e.printStackTrace();
			}
		}
		return studentMarksList;
	}
	
	public static void write(Map<String,Student> map){
		FileWriter fw = null;
		BufferedWriter bw = null;
		try{
			fw = new FileWriter(OUTPUT_FILE_NAME);
			bw = new BufferedWriter(fw);
			for(Entry<String,Student> entry : map.entrySet()){
				System.out.println("Key:"+entry.getKey()+" value:"+entry.getValue().getStudentId());
				bw.write(entry.getKey()+":"+entry.getValue().getStudentId());
				bw.newLine();
			}
			bw.close();
			fw.close();
			
		}catch(IOException ie){
			System.out.println("Unable to close the streams at the time Parsing the input.txt file");
			ie.printStackTrace();
		}finally{
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				System.out.println("Unable to close the streams at the time writin to the output.txt file");
				e.printStackTrace();
			}
		}
	}
	
	public static String[] splitString(String str){
		String[] studentsArr = str.split("\\|");
		return studentsArr;
	}

}
