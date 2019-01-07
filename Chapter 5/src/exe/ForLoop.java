package exe;

public class ForLoop {

	public static void main(String[] args) {
		int count = 0;
		for (count = 0 ; count < 100 ; count++ ) {
			System.out.println(count);
		}
		while ( count < 100) {
			System.out.println(count);
			count++;
		}
		count = 0;
		
		do {
			System.out.println(count);
			count++;
		}while(count <100);
	}

}
