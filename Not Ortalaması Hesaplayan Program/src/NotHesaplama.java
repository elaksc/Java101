import java.util.Scanner;

public class NotHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner inp= new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.println("T�rk�e notunuz: ");
        turkce = inp.nextInt();

        System.out.println("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.println("M�zik notunuz: ");
        muzik = inp.nextInt();

        double ort = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.print("Not Ortalaman�z : ");
        System.out.println(ort);

        String durum = ort > 60 ? "Ge�tiniz" : "Kald�n�z";
        System.out.println(durum);





    }
}