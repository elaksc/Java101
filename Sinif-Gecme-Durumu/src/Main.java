import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int mat, fizik, turkce, kimya, muzik;
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Matematik Notunu Giriniz");
		mat = inp.nextInt();
		
		
		System.out.println("Fizik Notunu Giriniz");
		fizik = inp.nextInt();
		
		System.out.println("Turkce Notunu Giriniz");
		turkce = inp.nextInt();
		
		System.out.println("Kimya Notunu Giriniz");
		kimya = inp.nextInt();
		
		System.out.println("Muzik Notunu Giriniz");
		muzik = inp.nextInt();
		
		int ortalama = (mat+ fizik+ turkce+ kimya+ muzik)/5;
		if(ortalama <= 55) {
			System.out.println("Ortalamanýz : "+ ortalama + " Geçemediniz");
		}
	    else if (ortalama < 0 || ortalama > 100) {
         System.out.print("Lütfen ders deðerlerini 0 ile 100 arasýnda giriniz!");
        }
	    else {
	    	System.out.println("Ortalamanýz :"+ ortalama + " Geçtiniz");
	    }
	 	
		
	}

}
