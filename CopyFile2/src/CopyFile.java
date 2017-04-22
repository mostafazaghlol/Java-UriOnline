import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


public class CopyFile {

	public static void main(String[] args) {

try {
	File f1=new File("Desktop/hi.txt");
	File f2=new File("hi copied.txt");
	FileUtils.copyFile(f1, f2);
	
	System.out.print("file coped");
} catch (FileNotFoundException e) {

	e.printStackTrace();
} catch (IOException e) {

	e.printStackTrace();
}



	

	}

}

