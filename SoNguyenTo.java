import java.util.Scanner;


public class SoNguyenTo {
	protected static Scanner cout = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Nhap vao so can kiem tra: ");
		int x = cout.nextInt();
		
		int mid = x/2;
		for(int i = 2 ; i <= mid; i++) 
			if(x % i == 0) { // nếu x chia hết cho 1 số khác 1 và chính nó thì nó ko phải số nguyên tố và dừng lại
				System.out.println(x + " khong phai la so nguyen to");
				return;
			}
		// nếu nó ko chia hết cho bất kì số nào từ 2 đến x/2 (nữa khoảng sau = gấp đôi nên ko cần xét) thì nó là snt
		System.out.println(x + " la so nguyen to");

	}

}
