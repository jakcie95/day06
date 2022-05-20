package quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		for(int num1 =1; num1 <7; num1++) {
			for(int num2 =1; num2 <7; num2++) {
				if(num1+num2 ==6) {
					System.out.println("("+ num1 +"," + num2 +")");
				}
			}
		}
		System.out.println();
		
}
}

