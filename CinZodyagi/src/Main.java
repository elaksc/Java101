import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int year, mod;
		String zodiac = "";

		Scanner inp = new Scanner(System.in);

		System.out.println("Do�um Yilinizi Giriniz");
		year = inp.nextInt();

		mod = year % 12;

		switch (mod) {
		case 0: 
			zodiac = "Maymun";
			break;
		case 1: 
			zodiac = "Horoz";
			break;
		case 2: 
			zodiac = "K�pek";
			break;
		case 3: 
			zodiac = "Domuz";
			break;
		case 4: 
			zodiac = "Fare";
			break;
		case 5: 
			zodiac = "�k�z";
			break;
		case 6: 
			zodiac = "Kaplan";
			break;
		case 7: 
			zodiac = "Tav�an";
			break;
		case 8: 
			zodiac = "Ejderha";
			break;
		case 9: 
			zodiac = "Y�lan";
			break;
		case 10: 
			zodiac = "At";
			break;
		case 11: 
			zodiac = "Koyun";
			break;
			
		}
		System.out.println("�in Zodyag� Burcunuz : " + zodiac);
	}
	
}
