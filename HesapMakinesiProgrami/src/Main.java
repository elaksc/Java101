import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Birinci Say�y� Giriniz");
		double number = inp.nextInt();
		
		System.out.println("�kinci Say�y� Giriniz");
		double number2 = inp.nextInt();
		
		System.out.println("1-Toplama\n 2-Cikarma\n 3-Carpma\n 4-Bolme");
		System.out.println("Hangi i�lemi yapmak istersiniz?");
		int select = inp.nextInt();
		
		switch(select) {
		case 1: 
			System.out.println("Sonuc: "+ (number + number2));
			break;
		case 2: 
			System.out.println("Sonuc: "+ (number - number2));
			break;
		case 3: 
			System.out.println("Sonuc: "+ (number * number2));
			break;
		case 4: 
			System.out.println("Sonuc: "+ (number / number2));
			break;
			
		default: 
			System.out.println("Hatali se�im yapt�n�z. Tekrar deneyiniz");
		}
		

	}

}
