package day06;

public class Ex01 {

	public static void main(String[] args) {
		int su1, su2;
		for(su1 = 1; su1 <= 5; su1++) {
			System.out.println("===for시작");
			for(su2 = 1; su2 <= 5; su2++) {
				System.out.println(su1 + ":"+su2);
			}
			System.out.println("for끝===");
		}
		int sum=0;
		for(int i =1; i< 10000; i++) {
			if(i%2 == 0) 
				sum+=i;
			}
		System.out.println("1~10000 짝 합 : " +sum);
}
}








