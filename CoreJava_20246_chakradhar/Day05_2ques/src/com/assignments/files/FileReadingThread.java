package com.assignments.files;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadingThread extends Thread{
	String fileName;
	FileReadingThread(String fileName){
		this.fileName=fileName;
	}
	public synchronized void run() {
		try {
			FileInputStream fis=new FileInputStream(fileName);
			Thread.sleep(3000);
			int k=0;
			while((k=fis.read())!=-1) {
				System.out.println((char)k);
			}
			System.out.println("Success from file reading");
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
