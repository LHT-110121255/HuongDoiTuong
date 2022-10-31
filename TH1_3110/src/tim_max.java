import java.util.Scanner;


public class tim_max {
	protected static Scanner cout =  new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nhap vao so nguyen a: ");
		int a = cout.nextInt();
		System.out.println("Nhap vao so nguyen b: ");
		int b = cout.nextInt();
		System.out.println("Nhap vao so nguyen c: ");
		int c = cout.nextInt();
		
		int max = a; // mặc định max = a
		max = (b > max)? max = b : max; // nếu b > max ( b > a)  thì max = b 
		max = (c > max) ? max = c : max;  // nếu c > max ( c > b > a) thì max = c
		System.out.println("so max: " + max);
	}
	
}