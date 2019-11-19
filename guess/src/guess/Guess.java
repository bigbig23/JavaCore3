package guess;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) throws Exception {
		// Ecrire une application qui permet de deviner lq lettre que vous avez en tete
		
		char a ,b='r';
		do {
		
			System.out.println("A letter to guess: ");
			Scanner scan = new Scanner(System.in);
			
			do {
				a = scan.nextLine().charAt(0);
			}while(a=='\n'| a=='\r');
			if(a==b) {
				System.out.println("right answer");
			}else {
				System.out.println("sooooory boday");
			}
			if(a < b) {
			System.out.println("low");
			}else {
				System.out.println("hight");
			}
				
			System.out.println("sorry try again");
			 
			}while(a != b);
			
			
	
		
		
		
		
		
		


		
	 
	 
			
		}
}












//my soluation


/*Scanner scan = new Scanner(System.in);

char input = scan.nextLine().charAt(0);
 

do {
	System.out.println("devine une lettre :  ");
	
	
	if (input < 'i') 
		System.out.println("tu es avant "); 
	else if (input > 'i')
		System.out.println("tu es apres ");
	else 
		System.out.println("bravo c la boone lettre");
	 
		

 
	 
}while(input >= 'a' && input <= 'z'); 
 
	
 
	
}*/











