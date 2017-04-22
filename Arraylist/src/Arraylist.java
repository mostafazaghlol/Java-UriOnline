import java.util.ArrayList;



public class Arraylist {

	public static void main(String[] args) {
ArrayList<String> mydegree=new ArrayList<String>();
mydegree.add("93.5");
mydegree.add("96.7");
System.out.println(mydegree);
mydegree.add("97.44");
java.util.ListIterator<String> listiteroter=mydegree.listIterator();
while (listiteroter.hasNext()) {
	String xx=listiteroter.next();
	System.out.println(xx);
	
}


	}

}
