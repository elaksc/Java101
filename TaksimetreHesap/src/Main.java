import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		float kmUcret, toplam, gidilenYol, acilisUcreti;
		acilisUcreti=10f;
		kmUcret=2.20f;
		
		System.out.println("Km Giriniz ");
		gidilenYol= inp.nextFloat();
		toplam= gidilenYol*kmUcret+acilisUcreti;
		
		
		
		System.out.println(toplam<20?" 20 TL ödemelisiniz": toplam + " TL ödemelisiniz");

	}

}
