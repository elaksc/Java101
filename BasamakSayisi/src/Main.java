import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int sayi, kalan, toplam = 0;
		boolean durum1 = true;
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Bir tam sayi giriniz: ");
		sayi = inp.nextInt();

		while (sayi > 0) {
			kalan = sayi % 10;
			toplam = toplam + kalan;
			sayi = sayi / 10;
		}
		
		System.out.println("Sayýdaki rakamlarýn toplamý : " + toplam);

	}

}
