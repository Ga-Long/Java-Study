import java.util.*;

public class B1546 {
	public static void main(String[] args) {
		double avg=0, sum=0;
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		double[] score= new double[n];
		for(int i =0;i<n;i++) {
			score[i] = sc.nextInt();
		}
		//�ְ��� ã��
		double M=score[0];
		for(int i =1;i<n;i++) {
			if(M<score[i])M=score[i];
		}
		//��� ���� /M*100
		for(int i =0;i<n;i++) {
			score[i] = (score[i]/M)*100;
			sum+=score[i];
		}
		avg = sum/n;
		System.out.println(avg);
		
	}
	
}
