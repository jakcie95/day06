package quiz;

public class Quiz02 {

	public static void main(String[] args) {
		int a, b;
		for(a = 1; a <=5; a++) {
			for(b=1; b<=5; b++) {
				System.out.print(a*b+"\t");
			}
			System.out.println();
		}
		int c, d;
		for(c = 0; c <=5; c++) {
			for(d=1; d<6; d++) {
				System.out.print(d+(5*c) +"\t");
			}
			System.out.println();
		}
}
}
