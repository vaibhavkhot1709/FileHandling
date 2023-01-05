package com.filehandling.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterCls {
	public static void main(String[] args) throws IOException {

		System.out.println("main started");
		FileWriter fr = new FileWriter("D:/JAVA/FileHandling/FileWrite/filerwiting.txt");

//		fr.write("my name is vaibhav khot");
//		fr.write(" im from kolhapur district of MH");
		
		
		System.out.println("to add multiple lines at time we use BuferWriter class");
		
		BufferedWriter br=new BufferedWriter(fr);
		br.write("my name is vaibhav khot");
		
		br.close();
		fr.close();
		

		System.out.println("filw writing successfullt donesucc");
	}

}
