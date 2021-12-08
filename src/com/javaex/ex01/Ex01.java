package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws Exception{
		// 1. IO Stream
		//바이트스트림으로 이미지를 입력받고 출력하는 방법
		
		InputStream in = new FileInputStream("/Users/hs/JavaStudy/file/img.jpg");//들어오는 빨대
		OutputStream out = new FileOutputStream("/Users/hs/JavaStudy/file/bytemig.jpg");//나가는 빨대
		
		byte[] buff = new byte[1024];//출력 속도를 높이기 위한 byte 그릇 준비.
		
		System.out.println("복사 시작");
		
		while(true) {
			int data = in.read(buff);//쟁반에 담는 리드
			
			if(data==-1) {
				System.out.println("복사가 완료되었습니다"+data);
				break;
			}
			
			out.write(buff);
		}
		/* 조금느린 출력
		 System.out.println("복사 시작");
		while(true) {
			int data = in.read();
			
			if(data==-1) {//data는 마지막에 -1이 온다.
				System.out.println("복사가 완료되었습니다."+data);
				break;
			}
			out.write(data); //Q.이것도배열같은건지
		}
		*/
		
		//빨대 회수
		in.close();
		out.close();
		
	}

}
