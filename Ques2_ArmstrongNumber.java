package zsgsAssesment2;

import java.util.Scanner;

public class Ques2_ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int N = scanner.nextInt();
		
		int sum=0;
		int temp=N;
		int length=String.valueOF(N).length();		
		while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit,length);
            temp /= 10;
        }

        if (sum == N) {
            System.out.println(N + " is an Armstrong number.");
        } else {
            System.out.println(N + " is not an Armstrong number.");
        }
		
	}

}
