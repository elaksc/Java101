import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double sicaklik;
		Scanner inp = new Scanner(System.in);
		System.out.println("Hava Sýcaklýðýný Giriniz");
		sicaklik = inp.nextInt();
		
		if(sicaklik<5) {
			System.out.println("Hava Sýcaklýðý Kayak Yapmaya Uygun");
		}
		else if((sicaklik > 5) && (sicaklik < 15)) {
			System.out.println("Hava Sýcaklýðý Sinemaya Gitmek Ýçin Uygun");
			
		}
		else if((sicaklik > 15) && (sicaklik < 25)) {
			System.out.println("Hava Sýcaklýðý Piknik Yapmak Ýçin Uygun");
		}
		else if(sicaklik > 25) {
			System.out.println("Hava Sýcaklýðý Yüzmek Ýçin Uygun");
		}
	}

}
