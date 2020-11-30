package test;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int num[] = new int[10];
		int sum = 0;
		int sum2 = 0;

		System.out.println("정수 10개를 입력하시오");
		System.out.println("입력> ");

		for (int i = 0; i < num.length; i++) {
			num[i] = scn.nextInt();
			if (i % 2 == 0) {
				sum+= num[i];
			} else if (i % 2 == 1) {
				sum2+= num[i];
			}
		}

		System.out.println("홀수의 합: " + sum);
		System.out.println("짝수의 합: " + sum2);

	}
}