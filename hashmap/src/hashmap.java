import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class hashmap {

	public static void main(String[] args) {
HashMap<String,String> x=new HashMap<String,String>();
x.put("mostafa","100%");
x.put("Esraa","1000%");
x.put("aya","120110%");
Set<String> key=x.keySet();
Iterator<String> ittertor=key.iterator();
while (ittertor.hasNext()) {
	String value=ittertor.next();
	System.out.println(value+"="+x.get(value));
	
}

	}

}
