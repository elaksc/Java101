import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Sayi Giriniz: ");
		int number = inp.nextInt();
		int result = number;
		int tempNumber = number;

		if (number == 0) {
			System.out.println("0 Kullanılamaz");
		} else {
			pattern(number, result, tempNumber);
		}
	}

	static void pattern(int number, int result, int tempNumber) {
		if (tempNumber <= 0) {
			System.out.print(result + " ");
			result += 5;
			if (result == number) {
				System.out.print(result + " ");
				return;
			}
		} else if (tempNumber > 0) {
			System.out.print(result + " ");
			result -= 5;
			if (result <= 0) {
				tempNumber = result;
			}
		}
		pattern(number, result, tempNumber);
	}

}
