
public class Main {

	public static void main(String[] args) {
		String S1="Welcome to Egypt";
    	String s2=new String("WelcoMe to zefta");
    	System.out.println(S1);
    	if(S1.equals(s2)){
    		
    		System.out.println("they match");
    	}
    	else if(S1.equalsIgnoreCase(s2))
    	{System.out.println("they don't match");
    		
    	}
    	char[] ch=S1.toCharArray();
    	for (char c : ch) {
    		System.out.println(c);
			
		}
    	StringBuilder sb=new StringBuilder(S1);
    	sb.append(s2);
    	
    	System.out.println(sb);
    	

		String s1=("egypt is my love              ");
		System.out.println(s1.length());
		System.out.println(s1.indexOf('m'));
		System.out.println(s1.trim());
		String s3=s1.trim();
		System.out.println(s3.length());
		System.out.println(s1.indexOf("love"));
    	
    	
    	
	}}
	

