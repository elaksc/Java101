import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int sayi; 
		double unit = 0.0;
		
		System.out.println("Sayi Giriniz: ");
		sayi = inp.nextInt();
		

		for(double i =0; i<=sayi; i++) {
			unit = (1 /i);
			
		}
		System.out.println(unit);
	}

}
