import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double armut,elma,domates,muz,patlican,armutF,elmaF,domatesF,muzF,patlicanF,toplamF;
        
		Scanner inp=new Scanner(System.in);
        System.out.print("Armut Ka� Kilo ? :");
        armut=inp.nextDouble();
        
        System.out.print("Elma Ka� Kilo ? :");
        elma=inp.nextDouble();
        
        System.out.print("Domates Ka� Kilo ? :");
        domates=inp.nextDouble();
        
        System.out.print("Muz Ka� Kilo ? :");
        muz=inp.nextDouble();
        
        System.out.print("Patl�can Ka� Kilo ? :");
        patlican=inp.nextDouble();
        
        armutF= (armut*2.14);
        elmaF=(elma*3.67);
        domatesF=(domates*1.11);
        muzF=(muz*0.95);
        patlicanF=(patlican*5.00);
        
        toplamF=armutF+elmaF+domatesF+muzF+patlicanF;
        System.out.println("Toplam Tutar : "+toplamF+" TL");
	}

}
