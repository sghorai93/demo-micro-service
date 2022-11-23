package com.example.demo.micro.service.string;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		String str = "Shiva Durga Kali";
		StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
		
		while (stringTokenizer.hasMoreElements()) {
			System.out.println(stringTokenizer.nextToken());
			
		}
		
		String alphabetStr = "A,B,C,D,E,F";
		List<String> alphabetList = new ArrayList<>();
		StringTokenizer alphabetTokenizer = new StringTokenizer(alphabetStr,",");
		while (alphabetTokenizer.hasMoreTokens()) {
			alphabetList.add(alphabetTokenizer.nextToken());
		}
		
		alphabetList.forEach(alphabet -> System.out.print(alphabet+" "));
	}

}
