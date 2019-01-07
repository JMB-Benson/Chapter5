package exe;
import java.util.Scanner;
public class Kool {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a hex digit 0-9 or A-F");
		String hexString = input.nextLine();
		
		if (hexString.length() != 3) {
			System.out.println("you must enter exactly 3 characters");
			System.exit(3);
		}
		char ch1 = Character.toUpperCase(hexString.charAt(0));
		char ch2 = Character.toUpperCase(hexString.charAt(1));
		char ch3 = Character.toUpperCase(hexString.charAt(2));
		if (ch1 <='F' && ch1>= 'A') {
			int value = ch1 -'A'+10;
			System.out.println("The decimal value for hex digit "
			+ ch1 + " is " + value);
			
		}
		else if (Character.isDigit(ch1)) {
			System.out.println("The decimal value for hex digit " + ch1 + " is " + ch1);
			
		}
		if (ch2 <='F' && ch2>= 'A') {
			int value = ch2 -'A'+10;
			System.out.println("The decimal value for hex digit "
			+ ch2 + " is " + value);
			
		}
		else if (Character.isDigit(ch2)) {
				System.out.println("The decimal value for hex digit " + ch2 + " is " + ch2);
				
			}
		if (ch3 <='F' && ch3>= 'A') {
			int value = ch3 -'A'+10;
			System.out.println("The decimal value for hex digit "
			+ ch3 + " is " + value);
			
		}
		else if (Character.isDigit(ch3)) {
			System.out.println("The decimal value for hex digit " + ch3 + " is " + ch3);
			
		}
		
		
		 
		else {
			System.out.println(ch1 + ch2 + ch3 +" is an ivalid input");
		}
	}
	

}
