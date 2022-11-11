import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		int startIndex = 0;
		int[] list = { 1,2,4,5,6,7,8,8,2,6,9,11 };
		int duplicate[] = new int[list.length];
		System.out.println("Dizi : " + Arrays.toString(list));

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (i != j && list[i] == list[j]) {
					if (list[i] % 2 == 0) {
						if (!isFind(duplicate, list[i])) {
							duplicate[startIndex++] = list[i];
						}
						break;
					}
				}
			}
		}
		System.out.print("Tekrar Eden Çift Sayýlar: ");
		for (int value : duplicate) {
			if (value != 0) {
				System.out.print(value + " ");
			}

		}
	}

	static boolean isFind(int[] arr, int value) {
		for (int i : arr) {
			if (i == value) {
				return true;
			}
		}
		return false;
	}
}