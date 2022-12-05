import java.awt.Menu;
import java.nio.channels.MulticastChannel;
import java.security.PrivateKey;
import java.util.Scanner;


public class index  {
	protected static Scanner sc = new Scanner(System.in);

	protected static void menu() {

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathBasic m1 = new MathBasic();
		System.out.println("=======================================================================");
		System.out.println("||1.	phuong thuc tinh tong 2 so nguyen						 	 ||");
		System.out.println("||2.	Phuong thuc tinh giai thua									 ||");
		System.out.println("||3.	Phuong thuc giai phuong trinh bac 2							 ||");
		System.out.println("||4.	Phuong thuc tinh gia tri X mu Y								 ||");
		System.out.println("||5.	Phuong thuc xac dinh so nguyen to							 ||");
		System.out.println("||6.	Phuong thuc tim so nguyen lon nhat trong mot mang so nguyen  ||");
		System.out.println("||7.	Phuong thuc tinh tong giai thua 							 ||");
		System.out.println("||8.	Phuong thuc in ra vi tri so nguyen to trong khoang M,N		 ||");
		System.out.println("=======================================================================");
		System.out.println("Nhap lua chon: ");
		int lc = sc.nextInt();
		switch (lc) {
		case 1:
			System.out.println("Nhap M = ");
			int m = sc.nextInt();
			System.out.println("Nhap N = ");
			int n = sc.nextInt();
			System.out.println("Tong 2 so nguyen: " + m1.Tong2SoNguyen(n, m));
			break;
		case 2: 
			System.out.println("Nhap so can tinh giai thua: "); m = sc.nextInt();
			System.out.println(m + "! = " + m1.GiaiThua(m));
			break;
		case 3:
			System.out.println("Nhap a = "); int a = sc.nextInt();
			System.out.println("Nhap b = "); int b = sc.nextInt();
			System.out.println("Nhap c = "); int c = sc.nextInt();
			m1.PhuongTrinhBac2(a, b, c);
			break;
		case 4: 
			System.out.println("Nhap X = "); int X = sc.nextInt();
			System.out.println("Nhap Y = "); int Y = sc.nextInt();
			System.out.println("X^Y = " + m1.Mu(X,Y));
			break;
		case 5: 
			System.out.println("Nhap so can kiem tra: "); n =sc.nextInt();
			if(m1.SoNguyenTo(n) == true) {
				System.out.println("N la so nguyen to");
			} else {
				System.out.println("N khong la so nguyen to");
			}
			break;
		case 6:
			int [] arrInt = new int[10];
			System.out.println("Nhap so phan tu mang"); n = sc.nextInt();
			for(int i = 1; i <= n; i++) {
				System.out.println("nhap phan tu thu " + i + "\n");
				arrInt[i] = sc.nextInt();
			}
			System.out.println("mang vua nhap \n");
			for(int i = 1; i <= n; i++) {
				System.out.println("Phan tu thu " + i + "= " + arrInt[i] + "\n");
			}
			System.out.println("Max trong mang = " + m1.max(arrInt));
			break;
		case 7: 
			System.out.println("Tinh tong giai thua tu tu 1! -> n!, nhap n"); n =sc.nextInt();
			MathAdvanced m2 = new MathAdvanced();
			System.out.println("Tong 1! -> n! = " +  m2.tongGiaiThua(n));
			break;
		case 8: 
			MathAdvanced m3 = new MathAdvanced();
			System.out.println("cac so nguyen to trong khoang [M,N] ?");
			System.out.println("Nhap M = "); m = sc.nextInt();
			System.out.println("Nhap N = "); n = sc.nextInt();
			System.out.println("SNT tai cac vi tri: \n");
			m3.outSNT(m, n);
			break;
		default:
			System.err.println("Yeu cau khong co, nhap lai !!!");
			break;
		}
		
	}

}
