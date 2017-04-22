import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
ArrayList<String> list=new ArrayList<String>();
list.add("misr");
list.add("itlay");
list.add("Nour");
list.add("Mostafa");
System.out.println(list);
ListIterator<String> listiterator=list.listIterator();
while(listiterator.hasNext()){
	String vale=listiterator.next();
	System.out.println(vale);}
	HashMap<String,String> hashmap=new HashMap<String, String>();
	hashmap.put("Mostafa","20000");
	hashmap.put("Nourhanne","200000000000000000000000");
	hashmap.put("aya","500000000000000000");
	Set<String> hi=hashmap.keySet();
	Iterator<String> hii=hi.iterator();
while(hii.hasNext()){
		
		String vale2=hii.next();
		System.out.println(vale2);
		
	}
	
	
	
	
	}

}
