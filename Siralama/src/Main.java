import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, c;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Birinci Say�y� Giriniz");
		a = inp.nextInt();
		System.out.println("�kinci Say�y� Giriniz");
		b = inp.nextInt();
		System.out.println("���nc� Say�y� Giriniz");
		c = inp.nextInt();
		
		if((a<b) && (a<c)) {
			if(b<c) {
				System.out.println(a+ " < "+ b +" < " +c);
			}
			if(c<b) {
				System.out.println(a+ " < " +c+ " < " +b);
			}
		}
		else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.print(b +" < " + a +" < " + c);
            } else {
                System.out.print(b +" < "+ c+ " < "+ a);
            }
		}
		else {
            if (a < b) {
                System.out.print(c+ " < "+ a+ " < " +b);
            }else {
                System.out.print(c +" < " + b +" < " + a);
            }
        }
	}

}
