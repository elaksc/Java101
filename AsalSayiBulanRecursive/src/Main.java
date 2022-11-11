import java.util.Scanner;

public class Main {
	static void AsalBulma(int i, int number) {
		if(number == i) {
			System.out.println(number + " Asal sayidir");
			return;
		}
		else if(number % i == 0) {
			System.out.println(number + " Asal Sayi deðildir");
			return;
		}
		AsalBulma(i+1, number);
		
		
	}
		 
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Sayi Giriniz: ");
		int number = inp.nextInt();
		AsalBulma(2, number);
	}

}
