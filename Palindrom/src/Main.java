import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sayi,gecici,sonuc=0;
		Scanner inp = new Scanner(System.in);
		System.out.println("Bir sayi giriniz : ");
		sayi = inp.nextInt();
		
		gecici = sayi;
		while(gecici != 0) {
			sonuc *= 10;
			sonuc = sonuc + gecici % 10;
			gecici = gecici / 10;
		}
		if(sayi == sonuc)
			System.out.println(sayi +" Palindromik sayidir");
		else
			System.out.println(sayi +" Palindromik sayi deðildir");		
	}

}
