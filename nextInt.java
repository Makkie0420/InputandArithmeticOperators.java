package scanr;
import java.util.*;
public class nextInt {

	public static void main(String[] args) {
		LinkedList<Integer> mylist = new LinkedList<>();/////////////
		var scanr = new Scanner(System.in);
	    int len;
        System.out.println("=======================");
        System.out.println("    array to length    ");
        System.out.println("=======================");
        System.out.print("length: ");
        len = scanr.nextInt();//////////
       
        for (int i = 0; i <len; i++) {
			System.out.println("index[" + i + "]: ");
			int val = scanr.nextInt();////////////
			mylist.add(val);///////////
			
		}
        System.out.println("======================");
        System.out.println("[1] display element   ");
        System.out.println("[2] display index     ");
        System.out.println("[3] exit              ");
        System.out.println("======================");
        
        while (true) {
        	System.out.print("Select transaction");
        	int tran = scanr.nextInt();
        	if (tran == 1) {
        		System.out.println("display elements");
        		System.out.print(mylist);                      ///////////
        	}else if (tran == 2) {
        		System.out.print("display index");
        		while(true) {
        			System.out.print("enter index [0-" + (len -1 ) + "]: "); ////////
        			int idx = scanr.nextInt();
        			if (idx < 0 || idx > (mylist.element()+ 1)) {
        			   System.out.print("the value is out of index range.");
        			} else {        				
        				   System.out.print("the value is" + mylist.get(idx));//////////
        				   break;
        			   }
        		}
        	}else if (tran == 3)
        		break;
             else
        		System.out.println("invalid selection");
        	System.out.print("\n"); 	
        }
        System.out.println("end of program");
	}   
}
