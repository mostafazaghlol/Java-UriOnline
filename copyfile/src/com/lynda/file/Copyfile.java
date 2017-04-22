package com.lynda.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Copyfile {

	public static void main(String[] args) {

try {
	File f1=new File("hi.txt");
	File f2=new File("hi copied.txt");
	InputStream in=new FileInputStream(f1); 
	OutputStream out=new FileOutputStream(f2);
	
	
	byte[] buf=new byte[1024];
	int len;
	while ((len=in.read(buf))>0) {
		out.write(buf,0,len);
	}
	in.close();out.close();
	System.out.print("file coped");
} catch (FileNotFoundException e) {

	e.printStackTrace();
} catch (IOException e) {

	e.printStackTrace();
}



	

	}

}
