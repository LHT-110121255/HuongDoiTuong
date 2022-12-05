
public class MathAdvanced extends MathBasic {
	// tong giai thua
	public int tongGiaiThua(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += GiaiThua(i);
		}
		return sum;
	}
	
	// phuong thuc in ra snt trong [m,n]
	public void outSNT(int M, int N) {
		for(int i = M; i <= N; i++) {
			if (SoNguyenTo(i)) {
				System.out.println("\t" + i);
			}
		}
	}
}
