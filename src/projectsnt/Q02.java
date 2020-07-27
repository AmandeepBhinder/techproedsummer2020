package projectsnt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q02 {
	
	static int idNum = 202035;
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		String name = "";
		
		Scanner scan = new Scanner(System.in);
			
		while(!name.equals("q")) {
			
			System.out.println("Enter a personal name to create id");
			System.out.println("To end the program and see the output press 'q'");
			name = scan.nextLine();
			
			if(!name.equals("q")) {
				if(map.containsKey(name)) {
					name = name + ".";
				}
			    map.put(name, idNum);
			    idNum++;
			}
			
		}
		
		System.out.println(map);
		
		scan.close();
	}

}
