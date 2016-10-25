package task1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

     String sequence;
	 Scanner scanner = new Scanner(System.in);	
	 System.out.println("Please enter new sequence of parenthesis: ");
	 sequence  = scanner.nextLine();
	 
	 System.out.println(task1Method(sequence));
	 scanner.close();

	}
	
public static boolean task1Method(String st) {
	int status=0;
	for(int i=0; i < st.length(); i++) {
		if (String.valueOf(st.charAt(i)).equals("(")) {
			status++;
		} else {
			status--;
		         	if (status<0) return false;
		}
	}
	
	if (status>0){
		return false;
		
	} else return true;
	
}

}
