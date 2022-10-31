import java.util.Scanner;
import java.text.DateFormat;
import java.text.DecimalFormat;

public class GiaiPhuongTrinhBac1 {

	public static void main(String[] args) {
		int a, b;
		double x;
		DecimalFormat decimalFormat = new DecimalFormat("#.##"); // làm tròn đến 2 chữ số
		Scanner cout = new Scanner(System.in);
				
		System.out.println("Nhap vao a: ");
		a = cout.nextInt();
		System.out.println("Nhap vao b: ");
		b = cout.nextInt();
				
		System.out.println("Phuong Trinh: " + a + "x + " + b + "= 0");
		String ans;
		if(a == 0) {
			ans = (b == 0) ? "Vo so nghiem" : "vo nghiem";
		} else {
			ans = "nghiem x = " + decimalFormat.format(-b/a);
			System.out.print(ans);
		}

	}

}
