//Regular Expression 2
import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		String inp = sc.nextLine();
		System.out.println(UserMainCode.regularExpression(inp));
	}
class UserMainCode{
	public static boolean regularExpression(String inp){
		// pattern p= Pattern.conpile("[a-zA-Z0-9][R][0-9][a-zA-Z0-9]");
		// Matches m = p.matcher(inp);
		// return m.matches();
		return inp.matches("(^[2][1-9]$)|(^[3][0-9]$)|(^[4][0-5]$)");
		
	}
}	
	
}