import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		int s;
		int i, j;
		System.out.print("Olu�turulacak sat�r ve sutun say�s�n� gir: ");
		s = oku.nextInt();
		int[][] matris = new int[s][s]; // girilen say� kadar �ok boyutlu dizi olu�turur.
		int[][] transpoz = new int[s][s];
		for (i = 0; i < s; i++) {
			for (j = 0; j < s; j++) {
				System.out.println((i + 1) + "x" + (j + 1) + "say�y� gir");
				matris[i][j] = oku.nextInt();
				transpoz[i][j] = matris[i][j];
			}
		}
		for (i = 0; i < s; i++) { // transpoz al�nmam�� hali
			for (j = 0; j < s; j++) {
				System.out.print(matris[i][j] + "\t");

			}

			System.out.println("");

		}

		System.out.println("");
		for (i = 0; i < s; i++) {
			for (j = 0; j < s; j++) {
				System.out.print(transpoz[j][i] + "\t"); // traspoz al�nm�� hali

			}

			System.out.println("");

		}

	}

}