package com.javaex.ex03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// 1.1 문자스트림 - 문자를 파일로 쓰기(Write)
		
		Writer fw = new FileWriter("/Users/hs/JavaStudy/file/song.txt");//출력을 저장할파일 경로
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("학교종이 땡땡땡");
		bw.newLine();//줄바꿈, 컴퓨터의 환경에 따라 줄바꿈 코드가 다르기 때문에, 이 코드를 사용하면 원하는 환경에 맞게 줄바꿈을 해줌
		bw.write("어서모이자");
		bw.newLine();
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다리신다");
		
		bw.close();
		
	}

}
