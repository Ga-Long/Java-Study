import java.util.*;
public class B7468 {
	//덩치
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] deongchi = new int[N][2];
		int[] rank = new int[N];
		
		//입력 받기
		for(int i =0;i<N;i++) {
			deongchi[i][0] = sc.nextInt();
			deongchi[i][1] = sc.nextInt();
		}
		
		//돌리기
		for(int i =0;i<N;i++) {
			int count=1; //자신보다 덩치 큰 사람 찾기
			for(int j=0;j<N;j++) {
				if(deongchi[i][0]<deongchi[j][0]&& deongchi[i][1]<deongchi[j][1])
					count++;
			}
			rank[i]=count; //rank에 담아주고 count는 다시 1으로 시작.
			
		}
		
		for(int i=0;i<N;i++) {
			//System.out.print(deongchi[i][0] + " " + deongchi[i][1]);
			System.out.print(rank[i] + " ");
		}
		
		sc.close();
	}

}
