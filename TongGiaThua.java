import java.util.Scanner;
import java.util.Scanner;

public class TongGiaThua {
	protected static Scanner cout = new Scanner(System.in);
	
	public static void main(String[] args) {
		int S = 0, N;
		System.out.println("Nhap N");
		N = cout.nextInt();
		if(N == 1) 
			System.out.println("S = 1");
		else if (N == 0)
			System.out.println("S = 0");
		else if(N < 0)
			System.out.println("... N khong thoa yeu cau");
		else {
			System.out.println("S = " + Tong(N));
		}
	}
	protected static  int Tong(int N) {
		if(N <= 1) return 1;
		return giaiThua(N) + Tong(N-1);
	}
	protected static int giaiThua(int n) {
		if(n <= 1) return 1;
		return n * giaiThua(n-1);
	}

}
