import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		Scanner info =new Scanner(System.in);
		double r, a;
		
		System.out.println("Yar��ap Giriniz : ");
		r=info.nextInt();
		
		System.out.print("Merkez a��s�n� giriniz  : ");
		a =info.nextDouble();
		
		double alan = (Math.PI * (r*r)* a) / 360;
		System.out.println("Dairenin Alan� : "+ alan);
    }

}
