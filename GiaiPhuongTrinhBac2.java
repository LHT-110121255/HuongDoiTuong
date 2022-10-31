import java.util.Scanner;
public class GiaiPhuongTrinhBac2 {
	// tách định dạng scan ra riêng
	protected static Scanner cout =  new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nhap vao  a: ");
		float a = cout.nextFloat();
		System.out.println("Nhap vao b: ");
		float b = cout.nextFloat();
		System.out.println("Nhap vao c: ");
		float c = cout.nextFloat();
		if(a == 0) {
			String kt = (b == 0) ? "vo nghiem" : "Pt co 1 nghiem x = " + (-c/b);
			System.out.println(kt);
		}
		float delta = b*b - 4*a*c;
		float x1, x2;
		if(delta > 0) {
			 x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
	         x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
	         System.out.println("Phương trình có 2 nghiệm là: "
	                    + "x1 = " + x1 + " và x2 = " + x2);
	    } else if (delta == 0) {
	    	x1 = (-b / (2 * a));
	        System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
	    } else {
	        System.out.println("Phương trình vô nghiệm!");
	    }
		// nếu sử dụng hàm Giai
//		GiaiPhuongTrinhBac2.Giai(a, b, c);
	}
	// nếu tách ra thành hàm
	public static void Giai(float a, float b, float c) {
		if(a == 0) {
			String kt = (b == 0) ? "vo nghiem" : "Pt co 1 nghiem x = " + (-c/b);
			System.out.println(kt);
		}
		float delta = b*b - 4*a*c;
		float x1, x2;
		if(delta > 0) {
			 x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
	         x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
	         System.out.println("Phương trình có 2 nghiệm là: "
	                    + "x1 = " + x1 + " và x2 = " + x2);
	    } else if (delta == 0) {
	    	x1 = (-b / (2 * a));
	        System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
	    } else {
	        System.out.println("Phương trình vô nghiệm!");
	    }
	}
	
}
