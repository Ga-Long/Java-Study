import java.util.*;

public class B2231 {

	private static int getDivideSum(int N) {
		
		int M=0;//�츮�� ã�ƾ� �� ��
		
		for(int i =0; i<N;i++) {//N���� ���� ������ �Ѱ��� ã��
			int number = i;
			//100�� �ڸ������ �����ߴ�.
			int sum=0;  
			while(number !=0) {
				sum+=number%10; //�ڸ��� ���ϱ�
				number/=10;
			}
			
			if(sum + i == N) { // �ڱ� �ڽ� ���ϱ� 
				M = i;
				break;
			}
			
		}
		return M;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M; int N; //M�� N�� ������ 
	
		N = sc.nextInt();
		
		M = getDivideSum(N);
		System.out.println(M);
		
		sc.close();
		
	}

}
