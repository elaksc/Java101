import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number, min = 1, max = 1, counter;
		Scanner inp = new Scanner(System.in);

		System.out.println("Ka� tane say� gireceksiniz: ");
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
		System.out.println("En b�y�k say�: " + max);
		System.out.println("En k���k say�: " + min);
	}

}
