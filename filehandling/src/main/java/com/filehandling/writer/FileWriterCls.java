package com.filehandling.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterCls {
	public static void main(String[] args) throws IOException {

		System.out.println("main started");
		FileWriter fr = new FileWriter("D:/JAVA/FileHandling/FileWrite/filerwiting.txt");

		fr.write("my name is vaibhav khot");
//		fr.write(" im from kolhapur district of MH");
		fr.close();
		
		System.out.println("succ");

	}

}
