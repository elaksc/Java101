import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number, total = 0;

		Scanner inp = new Scanner(System.in);

		System.out.println("Sayi Giriniz: ");
		number = inp.nextInt();
		
		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 && i % 4 == 0) {

				total = total + i;
			}
		}
		System.out.println("\n3 ve 4 e bölünen sayýlarýn toplamý = " + total);
	}

}
