package array;

import java.util.Scanner;

public class exam_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			int result = 0;
			int answer = 0;
			String in = sc.next();
			
			for (int j = 0; j < in.length(); j++) {
				
				if (in.charAt(j) == 'O') {
					result++;
				} else {
					result = 0;
				}

				answer += result;
			}
			System.out.println(answer);
		}
	}
}
