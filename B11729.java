import java.util.*;

public class B11729 {
	
	private static void hanoi_tower(int n, int from, int tmp, int to) {		
		if(n==1) {
			System.out.println(from+" "+ to );	
		}
		else {
			hanoi_tower(n-1,from,to,tmp);
			System.out.println(from+" "+ to );
			hanoi_tower(n-1,tmp,from,to);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N; //원판의 개수
		N=sc.nextInt();
		
		System.out.println((int)(Math.pow(2, N)-1));
		hanoi_tower(N,1,2,3);
		
		sc.close();
	}

}
