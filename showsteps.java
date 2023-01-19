package javaYotube;
import java.util.Scanner;

public class showsteps {
	static Scanner input = new Scanner(System.in);
	
	static void printElem(int []arrP) {
		for(int ar :arrP)
			System.out.print(ar+"");
		System.out.println(" ");
	}
	static void sortBubble(int[] arrP) {
	        for(int i = 0; i < arrP.length-1; i++) {
	            for(int j = 0; j < arrP.length-1; j++) {
	                if(arrP[j] > arrP[j] + 1) { 
	                    int temp = arrP[j];
	                    arrP[j] = arrP[j + 1];
	                    arrP[j + 1] = temp;
	                }
	                for(int x : arrP)
	                    System.out.print(x + " ");
	                System.out.println();
	        }
	            printElem(arrP);
	    }
	}
	public static void main(String[] args) {
		System.out.println("-------------------------------------");
		System.out.println(" Displaying the steps for bubble sort");
		System.out.println("-------------------------------------");
		System.out.println("Array Length: ");
        int len = input.nextInt();
        int []arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
			System.out.print("value for index["+i+"]: ");
			arr[i] = input.nextInt();
			
		}
        System.out.println("arrays element");
        printElem(arr);
        System.out.println("------------------");
        sortBubble(arr);
        System.out.println("------------------");
        System.out.println("end of program");
	}

}
