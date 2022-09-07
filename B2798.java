import java.util.*;

public class B2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int near=0;
		int N,M; //N�� ī�� ����, M�� ã�ƾ��� ��
		N = sc.nextInt();
		M = sc.nextInt();
		
		int[] card =new int[N];
		for(int i=0;i<N;i++) {
			card[i] = sc.nextInt();
		}
		
		//i, j, k�� �� �ٸ� �� �̿����Ѵ� �ڡڡ�
		for(int i =0;i<N-2;i++) {
			for(int j =1;j<N-1;j++) {
				if(j==i)break;
				for(int k=2;k<N;k++) {
					if(k==j && k==i)break;
					sum=card[i]+card[j]+card[k];
					if(sum<=M && sum>near) {//���� ã�ƾ��� ��M���� �۰ų� ���ƾ��ϰ�, ���� ã�Ƴ� near���� Ŀ�ߴ�
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
