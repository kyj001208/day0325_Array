package ex;

import java.util.Scanner;

public class Solutiontest02 {

	public static void main(String[] args) {
		// 국어,영어,수학 점수 (0~100)을 키보드에서 각각 입력 받아
		// 총점과 평균(소숫점 아래 3자리에서 반올림하여 2자리까지 표현)을 출력하세요
		// 각 점수는 배열에 저장하고 사용하세요

		int sum = 0;
		double num=0;

		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		int[] arr = new int[score];

		for (int i = 0; i < score; i++) {

			arr[i] = sc.nextInt();

			sum += arr[i]; // 입력한 3가지 더한 값
		
			
		}
		
		num =(double)sum /arr.length;
		System.out.println("총점" + sum);
		
		System.out.printf("평균:%.2f\n", num);
		// %.2f:실수형 출력서식, 소숫점아래 두자리까지  표기(3자리에서 반올림)

	}

}
