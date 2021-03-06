package com.javaex.ex02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// 1.2 IO stream - 바이트 스트, bufferdStream

		InputStream in = new FileInputStream("/Users/hs/JavaStudy/file/img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);
		
		OutputStream out = new FileOutputStream("/Users/hs/JavaStudy/file/bufferedimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		while(true) {
			int data = bin.read();
			if(data==-1) {
				System.out.println("복사가 완료되었습니다."+data);
				break;
			}
			bout.write(data);
		}
		
		bin.close();
		bout.close();
		//bufferedStream만 닫으면 됨.
	}

}
