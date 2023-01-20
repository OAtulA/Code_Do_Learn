
import java.io.*;

class Main {
	public static void main (String[] args) {
		
	    StringBuffer original = new StringBuffer( Integer.toString(10));
            System.out.println(original);
            StringBuffer reverse = original.reverse();
            System.out.println(reverse);
            System.out.println(original.equals(reverse));
	}
}
