import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		double a,b,c,cevre,alan;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("a kenarýný giriniz girin");
		a = inp.nextInt();
		System.out.println("b kenarýný giriniz girin");
		b = inp.nextInt();
		System.out.println("c kenarýný giriniz girin");
		c = inp.nextInt();
		
		cevre = a+b+c;
		
		alan = (int)Math.sqrt(cevre * (cevre - a) * (cevre - b) * (cevre- c));
		System.out.println("Üçgenin Alaný = " + alan);	
	}

}
