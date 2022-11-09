import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double para;
		Scanner inp = new Scanner(System.in);
		System.out.println("Tutarý Giriniz : ");
		para = inp.nextInt();

		if (para < 1000 && para > 0) {
			System.out.println("Kdv'siz Fiyat : " + para);
			double tutar1 = para * 0.18 + para;
			System.out.println("Kdv'li Fiyat : " + tutar1);
			double kdv = para * 0.18;
			System.out.println("Kdv tutari : " + kdv);
		}

		if (para > 1000) {
			System.out.println("Kdv'siz Fiyat : " + para);
			double tutar1 = para * 0.08 + para;
			System.out.println("Kdv'li Fiyat : " + tutar1);
			double kdv = para * 0.08;
			System.out.println("Kdv tutari : " + kdv);

		}

	}

}
