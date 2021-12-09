package com.javaex.ex06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.javaex.ex05.Person;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		// 연습문제 : 자신의 정보를 추가
		Scanner sc = new Scanner(System.in);
		
		Reader fr = new FileReader("/Users/hs/JavaStudy/file/PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		Writer fw = new FileWriter("/Users/hs/JavaStudy/file/PhoneDB.txt");//출력을 저장할파일 경로
		BufferedWriter bw = new BufferedWriter(fw);
		
		List<Person> pList = new ArrayList<Person>();
		
		//메모장을 읽어서 리스트에 저장
		while(true) {
			String str = br.readLine();
			if(str==null) {
				break;
			}
			String[] sArray = str.split(",");
			Person p = new Person(sArray[0], sArray[1], sArray[2]);
			pList.add(p);
		}
		
		//입력을 받아서 배열에 삽입
		System.out.println("데이터를 입력해 주세요");
		String put = sc.nextLine();
		String[] sArray = put.split(",");
		Person p = new Person(sArray[0], sArray[1], sArray[2]);
		pList.add(p);
		
		//배열을 메모장으로 출력
		for(Person ps:pList) {
			String a = ps.getName()+","+ps.getHp()+","+ps.getCompany();
			bw.write(a);
			bw.newLine();
		}
		
		//배열 출력
		for(Person ps:pList) {
			ps.showInfo();
		}
		sc.close();
		br.close();
		bw.close();
	}

}