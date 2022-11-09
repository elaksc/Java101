import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i, number;

		Scanner inp = new Scanner(System.in);

		System.out.println("Sayi Giriniz: ");
		number = inp.nextInt();

		System.out.println("4'ün Kuvvetleri");

		for (i = 1; i <= number; i *= 4) {
			System.out.println(i);
		}

		System.out.println("5'in Kuvvetleri");

		for (i = 1; i <= number; i *= 5) {
			System.out.println(i);
		}

	}

}
