import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int r,n,combination, nFactorial=1, rFactorial =1, rnFactorial=1;
		
		System.out.println("n deðerini giriniz : ");
		n = inp.nextInt();
		
		System.out.println("r deðerini giriniz: ");
		r = inp.nextInt();
		
		for(int i =1; i<=n; i++) {
			nFactorial *=i ;
		}
		
		for(int k =1; k<=r; k++) {
			rFactorial *= k ;
		}
		for(int k=1;k<=(n-r);k++) {
			rnFactorial = rnFactorial * k;
		}
		
	   combination =(nFactorial/(rFactorial*rnFactorial));
	   System.out.println("C ("+n+","+r+") = " + combination );
		
		

	}

}
