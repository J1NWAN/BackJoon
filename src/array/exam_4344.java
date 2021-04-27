package array;

import java.util.Scanner;
public class exam_4344 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] score;
		
		int tastcase = sc.nextInt();
		
		for(int i = 0; i<tastcase; i++) {
			
			int N = sc.nextInt(); // 학생 수
			score = new int[N];
			
			double sum = 0;
			
			for(int j = 0; j < N; j++) {
				int val = sc.nextInt();
				score[j] = val;
				sum += val;
			}
			
			double mean = (sum / N);
			double count = 0;
			
			for(int j = 0; j < N; j++) {
				if(score[j] > mean) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n", (count / N) * 100);
		}
	}

}
