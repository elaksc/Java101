import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String kullaniciAdi, sifre;
		int secim, ysifre;
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Kullanýcý Adýný Giriniz: ");
		kullaniciAdi = inp.nextLine();
		
		System.out.println("Þifrenizi Giriniz: ");
		sifre = inp.nextLine();
		
		boolean kullanici = kullaniciAdi.equals("Ela K");
		boolean kullaniciSifresi = sifre.equals("123456");
		
		if(kullanici == true && kullaniciSifresi == true) {
			System.out.println("Giriþ Yapýlýyor. Lütfen Bekleyiniz");
		}
		else if(kullanici == true || kullaniciSifresi == false) {
			System.out.println("Þifreniz yanlýþ. Sýfýrlamak için 0'a,  Çýkýþ için 1'e basýnýz");
			secim = inp.nextInt();
			switch (secim) {
			case 0: {
				Scanner inp2 = new Scanner(System.in);
				System.out.print("Oluþturmak istediðiniz yeni þifrenizi giriniz: ");
				ysifre = inp2.nextInt();
				
				if(ysifre == 123456) {
					System.out.println("Þifreniz eski þifrenizden farklý olmalýdýr\nLütfen tekrar deneyiniz");
				}
				else {
				System.out.println("Þifreniz deðiþtirildi.Yeni þifreniz: "+ysifre);
				}
				
				break;
			}
			case 1: 
				System.out.println("Sistemden çýkýldý");
				System.exit(0);
			default:
				System.out.println("Hatalý Seçim Yaptýnýz Sistemden Çýkýlýyor");
				System.exit(0);
			}
		}
		else 
			System.out.println("Kullanýcý bulunamadý..");
		
		
		

	}

}
