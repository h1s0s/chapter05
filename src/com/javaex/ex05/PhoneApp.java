package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		// 연습문제
		Reader fr = new FileReader("/Users/hs/JavaStudy/file/PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		List<Person> pList = new ArrayList<Person>();
		
		while(true) {
			String str = br.readLine();
			if(str==null) {
				break;
			}
			 String[] sArray= str.split(",");
			 Person p = new Person(sArray[0], sArray[1], sArray[2]);
			 pList.add(p);
		}
		for(Person p:pList) {
			p.showInfo();
		}
		br.close();
	}

}