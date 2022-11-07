import java.util.Scanner;
public class SoNguyenTo {
	protected static Scanner cout = new Scanner(System.in);
	public static void main(String[] args) {
		int N,M;
		System.out.println("Cout start"); M =cout.nextInt();
		System.out.println("Cout end"); N =cout.nextInt();
		getNumbers(M, N);
	}
	public static void getNumbers(int lowerRange , int upper){
		int upperRange = upper +1;
		boolean[] sieve = new boolean[upperRange];
		for(int i = 0 ; i < upperRange ; i++){
			sieve[i] = true;	
		}	
		sieve[1] = sieve[2] = false;
		for(int i = 2; i < upperRange ; i++){
			for(int j = 2; j < i; j++)
				if(i%j==0)
					sieve[i] = false;
		}
		for(int i = lowerRange; i <  upperRange; i++){
			if(sieve[i] == true){
				System.out.print( i + "   ");
			}
		}
	}
}


