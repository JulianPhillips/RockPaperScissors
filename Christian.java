import java.util.Scanner;
public class Christian {

	public static void main(String[] args){
		
		
		
		// Rock,Paper,Scissor OK!
		// User Variable, Computer Class OK
		// How many times we won, How many times we lost OK
		// Game Class OK
		
// Go on as Long as the user wantsOK
// Make it go!OK
		
		
		Scanner user = new Scanner(System.in); // It creates a scanner object
		System.out.println("This is a game of Rock, Paper, and Scissors! Please choose, R,P,S");
		String L = user.nextLine();
		while(!((L.equals("P")) || (L.equals("S")) || (L.equals("R")))){
			System.out.println("Please print out R, P, Or S");
			L = user.nextLine();
			
		}
		Computer compy = new Computer ();
		Game timmy = new Game(L,compy);
		System.out.println("The computer chose :" +compy.getC());
		System.out.println("The user chose : "+L);
		System.out.println(timmy.results());
		System.out.println(timmy.toString());
		
		System.out.println("Do you wanna play again? Y/N");
		
		String cont = user.nextLine();
		
		
		
		
		while( cont.equals("Y")){
			System.out.println("Choose R, P,S");
			L = user.nextLine();
			while(!((L.equals("P")) || (L.equals("S")) || (L.equals("R")))){
				System.out.println("Please print out R, P, Or S");
				L = user.nextLine();
				
			}
			compy = new Computer();
			timmy.setU(L);
			timmy.setC(compy.getC());		
			System.out.println("The computer chose: " +compy.getC());
			System.out.println("The User chose: "+L);
			System.out.println(timmy.results());
			System.out.println(timmy.toString());
			System.out.println("do you wanna play again?Y/N");
			cont = user.nextLine();
			if(!cont.equals("Y")){
				System.out.print("Bye");
				break;
			}
		}
		System.out.print("Bye");
		
		
		


	}
}