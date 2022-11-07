import java.util.Scanner;

public class SoMu {
	protected static Scanner cout = new Scanner(System.in);
	
	public static void main(String[] args) {
		int X,Y;
		System.out.println("Nhap vao co so: "); X = cout.nextInt();
		System.out.println("Nhap vao so mu: "); Y = cout.nextInt();
		System.out.println("KQ " + X + "^" + Y + " = " + (float) Mu(X, Y));
	}
	protected static float Mu(int X, int Y) {
		if(Y < 0) {
			float Mau = 1;
			for(int i = 0; i > Y; i--) {
				Mau *= X;
			}
			return 1/Mau;
		} else if (Y == 0) return 1;
		else {
			int ans = 1;
			for(int i = 0; i < Y; i++)
				ans *= X;
			return ans;
		}
	}
}
