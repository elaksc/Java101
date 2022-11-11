import java.util.Scanner;

public class Main {

	static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

	  public static void main (String[]args){
	        String str;
	        Scanner inp=new Scanner(System.in);
	        System.out.print("Kelime giriniz : ");
	        str=inp.nextLine();
	        if (isPalindrome(str)){
	            System.out.println(str+" Kelime Palindromik Kelimedir ");
	        } else {
	            System.out.println(str + " Kelime Palindromik Kelime Deðildir! ");
	        }
	    }
}