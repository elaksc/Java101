import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ekok, ebob = 0;

		Scanner inp = new Scanner(System.in);
		System.out.println("n1 sayýsýný giriniz: ");
		int n1 = inp.nextInt();

		System.out.println("n2 sayýsýný giriniz: ");
		int n2 = inp.nextInt();

		int i = 1;
		while (i <= n2) {
			if (n1 % i == 0 && n2 % i == 0) {
				ebob = i;
			}
			i++;
		}
		ekok = (n1 * n2) / ebob;
		System.out.println(n1 +" ve "+  n2+ " Sayýlarýnýn Ebobu = " + ebob +"\n"+ n1 +" ve "+  n2+ " Sayýlarýnýn Ekoku = " + ekok);
	}

}
