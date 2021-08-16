package com.assignments.files;

public class FileSync {

	public static void main(String[] args) {
		String fileName="E://Test.txt";
		FileWritingThread fw=new FileWritingThread(fileName);
		FileReadingThread fr=new FileReadingThread(fileName);
		fw.start();
		fr.start();
	}

}
