package zsgsAssesment2;

import java.util.Scanner;

public class Ques1_Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int[] t = new int[n];
		t[0] = 0;
		t[1] = 1;
		for (int i = 2; i < n; i++) {
			t[i] = t[i - 1] + t[i - 2];
		}
		System.out.println("Reverse fibonnaci series is:");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(t[i] + " ");
		}
	}
}
