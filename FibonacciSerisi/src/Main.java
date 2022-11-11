import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int n, n1 =0, n2 =1, n3;
		System.out.println("Eleman Sayýsýný Girin : ");
		n = inp.nextInt();
		System.out.print(n1+ " " + n2);  //0 ve 1 yazdir
		
		for(int i =2; i<=n; i++) //ilk 2 terim 0 ve 1 her zaman yazýlacak. O yüzden döngü 2 den baþlýyor
		{
			n3 = n1+n2;
			System.out.print(" "+ n3);
			n1 = n2;
			n2=n3;
		}
		System.out.println();

	}

}
