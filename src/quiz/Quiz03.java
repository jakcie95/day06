package quiz;

public class Quiz03 {
public static void main(String[] args) {
	int arr[] =new int[] {10,54,13,17,25,30};
	for(int a =0; a < arr.length; a++) {
		if(arr[a]%2 == 0) {
			System.out.println("Â¦¼ö : "+ arr[a]);
		}else {
			System.out.println("È¦¼ö : "+arr[a]);
		}
	}
}
}
