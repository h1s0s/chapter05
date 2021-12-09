package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		// 1.3 문자 스트림 - UTF-8 이외의 형식 읽어오기
		//기본적으로 문자열을 내보내고 불러올때 UTF-8의형식으로 한다.
		//만약 이 외의 형식을 읽으려면, InputStream으로 2진수 코드로 읽어오도록 한다
		InputStream is = new FileInputStream("/Users/hs/JavaStudy/file/MS949.txt");//MS949를 2진수로 받아오는 클래스
		InputStreamReader isr = new InputStreamReader(is, "MS949");//2진수로 온 MS949의 코드를 문자열로 번역해주는 클래스, 인코딩을 변환
		BufferedReader br = new BufferedReader(isr);//배열의 그릇에 담아 출력속도를 빠르게 해줌
		
		while(true) {
			String str = br.readLine();
			if(str==null) {
				break;
			}
			System.out.println(str);
		}
		br.close();
	}

}
