
public class Main {

	public static void main(String[] args) {
		int[] arr = new int[] { 15, 15, 2, 10, 10, 2, 50, 20 };
		int[] fr = new int[arr.length];
		int visited = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;

					fr[j] = visited;
				}
			}
			if (fr[i] != visited)
				fr[i] = count;
		}

		System.out.println("Tekrar Sayýlarý");
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited)
				System.out.println(arr[i] + " Sayýsý " + fr[i] + " kere tekrar edildi ");
		}

	}

}
