import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		// ageDiscount : age<12
		// ageDiscount2 : 12<age<24
		// ageDiscount3 : age>65

		int km, age, type;
		double ageDiscount,normalTotal,typeDiscount;

		System.out.print("Enter your age: ");
		age = inp.nextInt();

		System.out.print("Enter Distance: ");
		km = inp.nextInt();

		System.out.print("Enter Your Trip Type: 1=>one direction , 2=>round trip");
		type = inp.nextInt();

		normalTotal = km * 0.10;
		System.out.print(normalTotal);

		// for discount

		if(km>0 &&age>0 && (type==1|| type==2)) {
			normalTotal=km*0.10;
			if(age<12) {
				ageDiscount =normalTotal*0.5;
			}
			else if (age>=10 &&age<=24) {
				ageDiscount=normalTotal*0.10;
			}
			else if (age> 65) {
				ageDiscount=normalTotal*0.30;
			}
			else {
				ageDiscount =0;
			}
			normalTotal -=ageDiscount;
			if(type==2) {
				typeDiscount =normalTotal*0.20;
				normalTotal =(normalTotal- typeDiscount);
			}
			System.out.println("Bilet Tutarý : "+normalTotal +"TL");
		}
		else {
			System.out.println("Girdiðiniz Deðerler Eksik veya Yanlýþ!");

		}


	}
}
