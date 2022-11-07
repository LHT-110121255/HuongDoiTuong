import java.util.Scanner;

public class TongSoNguyen {
	protected static Scanner cout = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Nhap N");
		int N = cout.nextInt();
		int arr[] = new int[N];
		for(int i = 0; i < N; i++) {
			System.out.println("Nhap phan tu thu" + i);
			arr[i] = cout.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < N; i++) {
			if(arr[i] %2 == 0)
				sum += arr[i];
		}
		System.out.println("S = " + sum);
	}
}
