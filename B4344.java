import java.util.*;

public class B4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score;
		double sum;
		double avg;
		int N;//학생의 수
		double goodN=0;
		int C = sc.nextInt(); //테스트 케이스 개수
		while(C>0) {
			sum=0;avg=0;goodN=0;
			N=sc.nextInt();
			score = new int[N];
			for(int i=0;i<N;i++) {
				score[i]=sc.nextInt();
				sum+=score[i];	
			}
			avg=sum/N;
			for(int i =0;i<N;i++) {
				if(avg<score[i]) {
					goodN++;
				}
			}
			double ratio = (goodN/N)*100;
			//System.out.println(Math.round(ratio*1000)/1000.0 + "%");
			System.out.println(String.format("%.3f", ratio) + "%");

			C--;
		}
		sc.close();

	}

}
