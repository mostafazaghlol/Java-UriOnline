import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;


public class Main {

	public static void main(String[] args) {
try {
	URL url=new URL("http://services.explorecalifornia.org/pox/tours.php");
	InputStream in= url.openStream();
	BufferedInputStream  buf=new BufferedInputStream(in);
	StringBuilder sb=new StringBuilder();
	while (true) {
		int data=buf.read();
		if(data==-1){
			break;
		}else{
			sb.append((char)data);
			
		}
		System.out.println(sb);
		
		
		
	}
} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
