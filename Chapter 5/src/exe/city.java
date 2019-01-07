package exe;
import java.util.Scanner;
public class city {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter the first city: ");
		
		String city1 = input.nextLine();
		
		System.out.println("Enter the second city: ");
		String city2 = input.nextLine();
		System.out.println("Enter the third city: ");
		String city3 = input.nextLine();
		System.out.println("Enter the forth city: ");
		String city4 = input.nextLine();
		System.out.println("Enter the fith city: ");
		String city5 = input.nextLine();
		
		String temp;
		
		
		 
		if (city1.compareTo(city2 )>0) {
			temp=city1;
			city1=city2;
			city2=temp;
			
		}
		if (city2.compareTo(city3)>0) {
			temp=city2;
			city2=city3;
			city3=temp;
			if (city1.compareTo(city2 )>0) {
				temp=city1;
				city1=city2;
				city2=temp;
				
			}
			
		}
		if (city3.compareTo(city4)>0) {
			temp=city3;
			city3=city4;
			city4=temp;
			if (city2.compareTo(city3)>0) {
				temp=city2;
				city2=city3;
				city3=temp;
				if (city1.compareTo(city2 )>0) {
					temp=city1;
					city1=city2;
					city2=temp;
					
				}
				
			}
				
			}
			if (city4.compareTo(city5)>0) {
				temp=city4;
				city4=city5;
				city5=temp;
				if (city3.compareTo(city4)>0) {
					temp=city3;
					city3=city4;
					city4=temp;
					if (city2.compareTo(city3)>0) {
						temp=city2;
						city2=city3;
						city3=temp;
						if (city1.compareTo(city2 )>0) {
							temp=city1;
							city1=city2;
							city2=temp;
							
						}
						
					}
						
					}	
				System.out.println("The cities in alphabetical order are: "+ city1+ " "+ city2+ " "+ city3+ " "+ city4+ " "+ city5);
			}
		}
		
		}
		
		 
			
		
			
		
	


	