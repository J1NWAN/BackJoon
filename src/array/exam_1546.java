package array;

import java.util.Arrays;
import java.util.Scanner;

public class exam_1546 {
	static Scanner sc = new Scanner(System.in);
	
	public static double solution1(double[] value) { // 조건문으로 최대값 찾는 방법
		
		double max = 0;
		double result = 0;
		
		for(int i = 0; i < value.length; i++) {
			value[i] = sc.nextDouble();
			
			if(max < value[i]) {
				max = value[i];
			}
		}
		
		for(int i = 0; i < value.length; i++) {
			value[i] = value[i] / max * 100;
			result += value[i];
		}
		
		result /= value.length;
		return result;
	}
	
	public static double solution2(double[] value) { // Array Sort 로 최대값 찾는 방법
		
		double result = 0;
		
		for(int i = 0; i < value.length; i++) {
			value[i] = sc.nextDouble();
		}
		
		Arrays.sort(value);
		
		
		for(int i = 0; i < value.length; i++) {
			result += (value[i] / value[value.length - 1]) * 100;
		}
		
		return result /= value.length;
	}
	
	public static void main(String[] args) {

//		double[] value = new double[sc.nextInt()];
		
//		System.out.println(solution1(value));
//		System.out.println(solution2(value));
	}
}
