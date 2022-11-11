
public class Main {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		int i, n;
		
		double mean = 0;
		for (i = 0; i < numbers.length; i++) {
			
			mean = mean + (1.0 / numbers[i]);
		}
		mean = numbers.length / mean;
		System.out.println("Harmonik Ortalama : " + mean);
	}
}
