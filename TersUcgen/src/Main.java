import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int basamakSayisi;
		System.out.println("Basamak Sayisi Giriniz");
		basamakSayisi = inp.nextInt();
		
		
		for (int i=basamakSayisi; i >0 ; i--){

            for (int k=basamakSayisi-i; k>0; k--){
                System.out.print(" ");
            }

            for (int j=(2*i)-1; j>0; j--){
                System.out.print("*");
            }

            System.out.println(" ");
        }

	}

}
