package zsgsAssesment2;

import java.util.Scanner;

public class Ques3_Divisibleby5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = scanner.nextInt();
		int[] A = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			A[i] = scanner.nextInt();
		}
		System.out.print("Enter the value of K: ");
		int K = scanner.nextInt();

		countKdivPairs(A, n, K);
	}

	public static void countKdivPairs(int[] A, int n, int K) {

		int count = 0;

		System.out.println("The pairs with sum divisible by " + K + " are:");
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((A[i] + A[j]) % K == 0) {
					count++;
					System.out.println("[" + A[i] + "," + A[j] + "]");
				}
			}
		}

		System.out.println("Number of pairs with sum divisible by " + K + ": " + count);
	}

}
