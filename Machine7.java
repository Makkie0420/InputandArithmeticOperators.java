package scanr;
import java.util.*;
public class Machine7 {

	public static void main(String[] args) {
		var input = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		String line = "---------------------------";
		System.out.print("Number of Element(s): ");
		int len = input.nextInt();
		System.out.println(line);
		System.out.println("  First In First Out  ");
		System.out.println(line);
		System.out.println("[1] Adding of Element");
		System.out.println("[2] Resetting");
		System.out.println("[3] Exit");
		System.out.println(line);

		while(true) {
			System.out.print("Stored Element(s): ");
			System.out.print(list);
			System.out.println();
			System.out.println(line);
			System.out.print("Enter Selection: ");
			int choice = input.nextInt();
			
			if(choice == 1) {
				System.out.print("Enter Element: ");
				int ele = input.nextInt();
				if(list.size() < len) {
					list.add(ele);
				}else {
					list.removeFirst();
					list.add(ele);
				}
				System.out.println(line);
			}else if(choice == 2) {
				list.clear();
				System.out.println(line);
			}else if(choice == 3) {
				System.out.println("end of program");
				break;
			}
		}
	}
}


