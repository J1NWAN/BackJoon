package string;

import java.util.Scanner;
public class exam_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		String a = sc.next();
		
		int sum = 0;
		
		for(int i = 0; i < count; i++) {
			sum += a.charAt(i) - '0';
		}
		System.out.println(sum);
	}

}
