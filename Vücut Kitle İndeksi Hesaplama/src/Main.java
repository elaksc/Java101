import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		System.out.println("L�tfen boyunuzu (metre cinsinde) giriniz :");
		double boy = inp.nextDouble();
		
		System.out.println("L�tfen kilonuzu giriniz :");
		int kilo = inp.nextInt();
		
		double kitleIndex = kilo / (boy * boy);
		System.out.println("V�cut Kitle �ndeksiniz : " + kitleIndex);

	}

}
