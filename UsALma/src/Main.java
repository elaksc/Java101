import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int us,sayi;
		
		
		System.out.println("Sayý Giriniz: ");
		sayi = inp.nextInt();
		
		System.out.println("Us sayisi: ");
		us = inp.nextInt();
		
		int toplam = 1;
		for(int i = 1; i<=us; i++) {
			toplam *= sayi;
		}
		 System.out.println("Sonuç: "+toplam);
	}
}
