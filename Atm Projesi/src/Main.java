import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userName, password;
		Scanner inp = new Scanner(System.in);
		int right = 3;
		int balance = 1500;
		int select;
		int price;

		System.out.print("Kullan�c� Ad�n�z :");
		userName = inp.nextLine();
		System.out.print("Parolan�z : ");
		password = inp.nextLine();

		if (userName.equals("ela") && password.equals("123456")) {
			System.out.println("Merhaba, Bankaya Ho�geldiniz!");
			do {
				System.out.println("1-Para yat�rma\n" + "2-Para �ekme\n" + "3-Bakiye Sorgula\n" + "4-��k�� Yap");
				System.out.print("L�tfen yapmak istedi�iniz i�lemi se�iniz : ");
				select = inp.nextInt();
				switch (select) {
				case 1:
					System.out.println("Para Miktar� : ");
					price = inp.nextInt();
					balance += price;
					System.out.println("Yeni Para Miktar� : "+ balance);
					break;

				case 2:
					System.out.println("Para Miktrar� : ");
					price = inp.nextInt();
					if (price > balance) {
						System.out.println("Bakiye Yetersiz...");
					} else
						balance -= price;
						System.out.println("Yeni Para Miktar� : "+ balance);

					break;

				case 3:
					System.out.println("Bakiyeniz : " + balance);
					break;
				}
			} while (select != 4);
			System.out.println("Tekrar G�r��mek �zere");

		} else {
			right--;
			System.out.println("Hatal� kullan�c� ad� veya �ifre. Tekrar deneyiniz.");
			if (right == 0) {
				System.out.println("Hesab�n�z bloke olmu�tur l�tfen banka ile ileti�ime ge�iniz.");
			} else {
				System.out.println("Kalan Hakk�n�z : " + right);
			}
		}

	}
}
