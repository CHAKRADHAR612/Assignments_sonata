package com.assignments.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.assignments.products.ProductDaoImpl;

public class FileWritingThread extends Thread {
	String fileName;
	FileWritingThread(String fileName){
		this.fileName=fileName;
	}
	public synchronized void run() {
		try {
			FileOutputStream fos=new FileOutputStream(fileName);
			fos.write(65);
			fos.write(66);
			fos.write(67);
			ProductDaoImpl pd=new ProductDaoImpl();
			String s=pd.getMaxPriceString();
			byte[] b=s.getBytes();
			fos.write(b);
			System.out.println("Success from file writing");
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
