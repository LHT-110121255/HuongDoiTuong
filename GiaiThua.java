import java.util.Scanner;

public class GiaiThua {
	protected static Scanner cout = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nhap n: ");
		int n = cout.nextInt();
		int ans = GiaiThua.giai_thua(n);
		System.out.println("Ket qua:" + ans);
	}
	public static int giai_thua(int n) {
		if(n <= 1) return 1;
		return n * giai_thua(n-1);
	}
}
