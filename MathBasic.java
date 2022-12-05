import java.util.Scanner;
import java.lang.Math;;

public class MathBasic {
	
	
	// phuong thuc tong 2 so nguyen
	public int Tong2SoNguyen(int n, int m) {
		return m+n;
	}
	
	// phuong thuc tinh giai thua
	public int GiaiThua(int n) {
		if(n <= 1) {
			return 1;
		}
		return n * GiaiThua(n-1);
	}
	
	//giai phuong trinh bac 2
	public void PhuongTrinhBac2(int a, int b, int c) {
		if(a+b+c == 0) {
			System.out.println("x1 = 1" + "x2 = " + c/a);
		} else if(a-b+c == 0) {
			System.out.println("x1 = -1" + "x2 = " + -c/a);
		}
		int dental = b*b - 4*a*c;
		if(dental < 0) {
			System.out.println("Vo nghiem");
		} else if(dental == 0) {
			float ans = -b/2*a;
			System.out.println("Nghiem kep x = " + ans);
		} else {
			float d = (float)Math.sqrt(dental);
			float x1 = (-b + d)/2*a;
			float x2 = (-b - d)/2*a;
			System.out.println("x1 = " + x1 + "\n" + "x2 = " + x2);
		}
	}
	
	// tinh x^y
	public int Mu(int X, int Y) {
		if(Y < 1) {
			return 1;
		}
		return X *Mu(X, Y-1);
	}
	
	// xac dinh so nguyen to 
	public boolean SoNguyenTo(int n) {
		for(int i = 0 ; i <= n/2; ++i) {
			if(n%i == 0) {
				return false; // neu n chia het cho so nao khac 1 & n thi no ko la so nguyen to
			}
		}
		return true;
	}
	
	// max 
	public int max(int [] arrInt) {
		int max = arrInt[0], i = 1;
		while (i != 0) {
			max = (arrInt[i] > max)? max = arrInt[i] : max;
			i++;
		}
		return max;
	}
}
