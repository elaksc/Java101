import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number, min = 1, max = 1, counter;
		Scanner inp = new Scanner(System.in);

		System.out.println("Kaç tane sayý gireceksiniz: ");
		counter = inp.nextInt();

		for (int i = 1; i <= counter; i++) {
			System.out.println(i + ". Sayiyi Giriniz : ");
			number = inp.nextInt();

			if (i == 1) {
				max = number;
				min = number;
			}
			if (number < min) {
				min = number;
			}
			if (number > max) {
				max = number;
			}
		}
		System.out.println("En büyük sayý: " + max);
		System.out.println("En küçük sayý: " + min);
	}

}
