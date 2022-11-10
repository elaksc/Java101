import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userName, password;
		Scanner inp = new Scanner(System.in);
		int right = 3;
		int balance = 1500;
		int select;
		int price;

		System.out.print("Kullanýcý Adýnýz :");
		userName = inp.nextLine();
		System.out.print("Parolanýz : ");
		password = inp.nextLine();

		if (userName.equals("ela") && password.equals("123456")) {
			System.out.println("Merhaba, Bankaya Hoþgeldiniz!");
			do {
				System.out.println("1-Para yatýrma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çýkýþ Yap");
				System.out.print("Lütfen yapmak istediðiniz iþlemi seçiniz : ");
				select = inp.nextInt();
				switch (select) {
				case 1:
					System.out.println("Para Miktarý : ");
					price = inp.nextInt();
					balance += price;
					System.out.println("Yeni Para Miktarý : "+ balance);
					break;

				case 2:
					System.out.println("Para Miktrarý : ");
					price = inp.nextInt();
					if (price > balance) {
						System.out.println("Bakiye Yetersiz...");
					} else
						balance -= price;
						System.out.println("Yeni Para Miktarý : "+ balance);

					break;

				case 3:
					System.out.println("Bakiyeniz : " + balance);
					break;
				}
			} while (select != 4);
			System.out.println("Tekrar Görüþmek Üzere");

		} else {
			right--;
			System.out.println("Hatalý kullanýcý adý veya þifre. Tekrar deneyiniz.");
			if (right == 0) {
				System.out.println("Hesabýnýz bloke olmuþtur lütfen banka ile iletiþime geçiniz.");
			} else {
				System.out.println("Kalan Hakkýnýz : " + right);
			}
		}

	}
}
