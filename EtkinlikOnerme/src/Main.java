import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double sicaklik;
		Scanner inp = new Scanner(System.in);
		System.out.println("Hava S�cakl���n� Giriniz");
		sicaklik = inp.nextInt();
		
		if(sicaklik<5) {
			System.out.println("Hava S�cakl��� Kayak Yapmaya Uygun");
		}
		else if((sicaklik > 5) && (sicaklik < 15)) {
			System.out.println("Hava S�cakl��� Sinemaya Gitmek ��in Uygun");
			
		}
		else if((sicaklik > 15) && (sicaklik < 25)) {
			System.out.println("Hava S�cakl��� Piknik Yapmak ��in Uygun");
		}
		else if(sicaklik > 25) {
			System.out.println("Hava S�cakl��� Y�zmek ��in Uygun");
		}
	}

}
