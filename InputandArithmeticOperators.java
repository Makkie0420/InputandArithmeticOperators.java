package javaYotube;

import java.util.Scanner;

public class InputandArithmeticOperators {
    static int sum, diff, prod, quo;
    
	public static void main(String[] args) {
		int grandtotal = total(5,5) [0] + 5;
		int grandtotal1 = total(5,5) [1] + 5;
		int grandtotal2 = total(5,5) [2] + 5;
		int grandtotal3 = total(5,5) [3] + 5;
		
		System.out.println(grandtotal);
		System.out.println(grandtotal1);
		System.out.println(grandtotal2);
		System.out.println(grandtotal3);
		

		sum += 1;
    	diff += 1;
    	prod += 1;
    	quo += 1;
  	
	}
	
        public static int[] total(int val1, int val2) {
        	
        	int sum = val1 + val2;
        	int diff = val1 - val2;
        	int prod = val1 * val2;
        	int quo = val1 / val2;
        
        	
        	int [] result  = {sum , diff, prod, quo};
        	
        	return result;
        }
     }
