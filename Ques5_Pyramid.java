package zsgsAssesment2;

import java.util.Scanner;

public class Ques5_Pyramid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int no = scanner.nextInt();

		for (int i = 1; i <= no; i++) {

			for (int j = no - i; j >= 1; j--) {
				System.out.print("  ");

			}

			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");

			}

			for (int l = i - 1; l >= 1; l--) {
				System.out.print(l + " ");
			}
			System.out.println();

		}
	}

}
