package exe;
import java.util.Scanner;
public class While_looops {

	public static void main(String[] args) {
		/*int count = 0;
		while (count < 100) {
			System.out.println(count +" I will not be late to class");
			count ++;
		}*/
		
		/*System.out.println("Your lone hero is surrounded by a massive army of trolls");
		System.out.println("their dexaying green bodies stretch out, melting into ther horizon.");
		System.out.println("your hero ucheathes his sword fo ther last fight of life./n");
		int health = 10;
		int trolls = 0;
		int damage = 3;
		
		while ( health>0 ) {
			trolls ++;
			health = health-damage;
			System.out.println("your hero swings and defeats an evil troll/n "
					+ "but takes " + damage+ " damage points. ");
					
		}
		System.out.println("your hero fought valiantly and defeated "+ trolls+ " trolls.");
		System.out.println("But alas, your hero is no more.");*/
		int count = 0;
		while ( count <10) {
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		
		while ( number1 + number2 != answer ) {
			System.out.print("Wrong answer. try again what is "+ number1 + " + "
		+ number2 + "? ");
			answer = input.nextInt();
			
			
		}
		System.out.println("You got it!");
		count ++;
		
		}
		System.out.println("You win!");
		
		
		
		
		
		
		

	}

}
