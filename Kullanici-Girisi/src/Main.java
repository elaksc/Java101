import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String kullaniciAdi, sifre;
		int secim, ysifre;
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Kullan�c� Ad�n� Giriniz: ");
		kullaniciAdi = inp.nextLine();
		
		System.out.println("�ifrenizi Giriniz: ");
		sifre = inp.nextLine();
		
		boolean kullanici = kullaniciAdi.equals("Ela K");
		boolean kullaniciSifresi = sifre.equals("123456");
		
		if(kullanici == true && kullaniciSifresi == true) {
			System.out.println("Giri� Yap�l�yor. L�tfen Bekleyiniz");
		}
		else if(kullanici == true || kullaniciSifresi == false) {
			System.out.println("�ifreniz yanl��. S�f�rlamak i�in 0'a,  ��k�� i�in 1'e bas�n�z");
			secim = inp.nextInt();
			switch (secim) {
			case 0: {
				Scanner inp2 = new Scanner(System.in);
				System.out.print("Olu�turmak istedi�iniz yeni �ifrenizi giriniz: ");
				ysifre = inp2.nextInt();
				
				if(ysifre == 123456) {
					System.out.println("�ifreniz eski �ifrenizden farkl� olmal�d�r\nL�tfen tekrar deneyiniz");
				}
				else {
				System.out.println("�ifreniz de�i�tirildi.Yeni �ifreniz: "+ysifre);
				}
				
				break;
			}
			case 1: 
				System.out.println("Sistemden ��k�ld�");
				System.exit(0);
			default:
				System.out.println("Hatal� Se�im Yapt�n�z Sistemden ��k�l�yor");
				System.exit(0);
			}
		}
		else 
			System.out.println("Kullan�c� bulunamad�..");
		
		
		

	}

}
