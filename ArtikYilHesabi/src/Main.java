import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int year, result;
	
		Scanner inp = new Scanner(System.in);
		System.out.println("Y�l Giriniz:  ");
		year = inp.nextInt();
		
		result = year % 4;
		
		if(result == 0) {
			System.out.println(year+" "+"Art�k  Y�ld�r.");
		}
		else {
			System.out.println(year+" "+"Art�k  Y�l De�ildir.");

		}
		
		

	}

}
