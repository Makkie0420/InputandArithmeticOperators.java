package scanr;
import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import Finals.Linkedlistpresent;
public class letter {
   
	public static void main(String[] args) {
		String line = "=============================";
		
		var input = new Scanner(System.in);
		
		LinkedList<Integer> list = new LinkedList<>();
		
		System.out.print("Number of Element(s):  ");
		int len = input.nextInt();
		
		System.out.println(line);
	    System.out.println("First in First out");
	    System.out.println("[1] SELECT [2] SELECT");
	    System.out.println("[3] SELECT [4] EXIT");
	    System.out.println(line);
	    
	    
	    while(true) {
	    	System.out.println("stored elements");
	    	System.out.println(line);
	    	System.out.println(list);
	    	int next = input.nextInt();
	    	
	        if (next == 1) {
	        	System.out.println("elements:");
	        	int pogi = input.nextInt();
				if (list.size() < len) {
					list.add(pogi);
					
				}
			}
	    	
	    	
	    }
	}

}
