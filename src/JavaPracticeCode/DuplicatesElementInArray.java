package JavaPracticeCode;

public class DuplicatesElementInArray {

	public static void main(String[] args) {

		String arr[] = { "Ashish", "nitin", "pooja", "mona" };

		boolean flag = true;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					System.out.println("Duplicate element found : " + arr[i]);
				}

			}

		}
		if (flag ==false) {
			System.out.println("Duplicate Element not found");
		}
	}
}
