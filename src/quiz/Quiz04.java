package quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		System.out.print("ÁÙÀÇ °¹¼ö : ");
		int result = sc.nextInt();
		
		for(int i = 0; i < result; i++) {
			
			for(int j = 1; j <result - i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k <i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	
}
}
