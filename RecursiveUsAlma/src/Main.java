import java.util.Scanner;

public class Main {

	static void usHesabi() {
		Scanner inp = new Scanner(System.in);
		int us, number;

		System.out.println("Sayý Giriniz: ");
		number = inp.nextInt();

		System.out.println("Us sayisi: ");
		us = inp.nextInt();
		
		int result = 1;
		
		if(us  == 0 ) {
			System.out.println("Sonuc: "+ result);
		}
		else {
			result =(int) Math.pow(number,us);
	         System.out.println("Sonuç: "+result);
		}
	}
	public static void main(String[] args) {
		usHesabi();
	}
}