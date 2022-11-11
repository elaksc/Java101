import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sayi, toplam = 0;
		Scanner inp = new Scanner(System.in);
		System.out.println("Sayi Giriniz");
		sayi = inp.nextInt();
		
		for(int i =1; i<sayi; i++) {
			if(sayi % i == 0) {
				toplam += i;
			}
		}
		if(toplam == sayi) {
			System.out.println(sayi + ":  Mükemmel sayidir ");
		}
		else {
			System.out.println(sayi + ":  Mükemmel sayi deðildir ");
		}
	}

}
