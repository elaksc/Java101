import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] list = { 15,12,788,1,-1,-778,2,0 };
		Scanner inp = new Scanner(System.in);
		System.out.println("Dizi : " + Arrays.toString(list));
		System.out.print("Girilen Sayi : ");
		int sayi = inp.nextInt();
		int min = list[0];
		int max = list[0];

		for (int i : list) {
			if (i < sayi && (sayi - i < 0 ? (sayi - i) * -1 : sayi - i) < (sayi - min < 0 ? (sayi - min) * -1
					: sayi - min)) {
				min = i;
			}
			if (i > sayi && (sayi - i < 0 ? (sayi - i) * -1 : sayi - i) < (sayi - min < 0 ? (sayi - min) * -1
					: sayi - min)) {
				max = i;
			}
		}

		System.out.println("Girilen say�dan k���k en yak�n say� : " + min);
		System.out.println("Girilen say�dan b�y�k en yak�n say� : " + max);
	}
}
