package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		// 1.2 문자 스트림 - 텍스트 파일을 읽기
		
		Reader fr = new FileReader("/Users/hs/JavaStudy/file/Song.txt");
		BufferedReader br = new BufferedReader(fr);//접시에 담아 읽기
		
		while(true) {
			String str = br.readLine(); //한줄씩 읽어옴->줄바꿈 기호는 제외
			if(str==null) { //문자 스트림은 마지막에 null값이 온다.
				break;
			}
			System.out.println(str);
		}

		
		br.close();
		

	}

}
