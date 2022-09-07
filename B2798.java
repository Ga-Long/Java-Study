import java.util.*;

public class B2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int near=0;
		int N,M; //N은 카드 개수, M은 찾아야할 합
		N = sc.nextInt();
		M = sc.nextInt();
		
		int[] card =new int[N];
		for(int i=0;i<N;i++) {
			card[i] = sc.nextInt();
		}
		
		//i, j, k는 다 다른 수 이여야한다 ★★★
		for(int i =0;i<N-2;i++) {
			for(int j =1;j<N-1;j++) {
				if(j==i)break;
				for(int k=2;k<N;k++) {
					if(k==j && k==i)break;
					sum=card[i]+card[j]+card[k];
					if(sum<=M && sum>near) {//합은 찾아야할 값M보다 작거나 같아야하고, 전에 찾아논 near보다 커야댐
						near = sum;
						System.out.println(near);
					}
				}
			}
		}
		System.out.println(near);
		
		sc.close();
	}
	
}
