import java.util.*;
public class B7468 {
	//��ġ
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] deongchi = new int[N][2];
		int[] rank = new int[N];
		
		//�Է� �ޱ�
		for(int i =0;i<N;i++) {
			deongchi[i][0] = sc.nextInt();
			deongchi[i][1] = sc.nextInt();
		}
		
		//������
		for(int i =0;i<N;i++) {
			int count=1; //�ڽź��� ��ġ ū ��� ã��
			for(int j=0;j<N;j++) {
				if(deongchi[i][0]<deongchi[j][0]&& deongchi[i][1]<deongchi[j][1])
					count++;
			}
			rank[i]=count; //rank�� ����ְ� count�� �ٽ� 1���� ����.
			
		}
		
		for(int i=0;i<N;i++) {
			//System.out.print(deongchi[i][0] + " " + deongchi[i][1]);
			System.out.print(rank[i] + " ");
		}
		
		sc.close();
	}

}
