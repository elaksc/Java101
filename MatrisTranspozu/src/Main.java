import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		int s;
		int i, j;
		System.out.print("Oluþturulacak satýr ve sutun sayýsýný gir: ");
		s = oku.nextInt();
		int[][] matris = new int[s][s]; // girilen sayý kadar çok boyutlu dizi oluþturur.
		int[][] transpoz = new int[s][s];
		for (i = 0; i < s; i++) {
			for (j = 0; j < s; j++) {
				System.out.println((i + 1) + "x" + (j + 1) + "sayýyý gir");
				matris[i][j] = oku.nextInt();
				transpoz[i][j] = matris[i][j];
			}
		}
		for (i = 0; i < s; i++) { // transpoz alýnmamýþ hali
			for (j = 0; j < s; j++) {
				System.out.print(matris[i][j] + "\t");

			}

			System.out.println("");

		}

		System.out.println("");
		for (i = 0; i < s; i++) {
			for (j = 0; j < s; j++) {
				System.out.print(transpoz[j][i] + "\t"); // traspoz alýnmýþ hali

			}

			System.out.println("");

		}

	}

}