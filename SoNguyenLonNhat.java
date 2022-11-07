import java.util.Scanner;

public class SoNguyenLonNhat {
	
	protected static Scanner cout = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Nhap so phan tu ");
		int N = cout.nextInt();
		int array[] = new int[N];
		for(int i = 0; i < N; i++) {
			System.out.println("Nhap phan tu thu " + i);
				array[i] = cout.nextInt();
		}
		System.out.println("So lon nhat " + Max(array, N));
	}

	public static int Max(int arr[], int N) {
		if(N == 0) return -1;
		if(N == 1) return arr[0];
		else {
			if(arr[N-1] > Max(arr, N-1))
				return arr[N-1]; 
			else return Max(arr, N-1);
		}
	}

}
