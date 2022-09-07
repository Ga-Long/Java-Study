import java.util.*;
import java.io.*;

public class B1018 {
	//체스판 다시 칠하기 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt(); 
		
		int miniWrongCount =64;
		String[] chase = new String[N];

		for(int i=0;i<N;i++) {
			chase[i] = sc.next();
		}
		
		String[] BWStart = new String[2];
		BWStart[0] = "BWBWBWBW";
		BWStart[1] = "WBWBWBWB";
		
		for(int i=0;i<=N-8;i++) { //N-8번만 해보자
			for(int j=0;j<=M-8;j++) {
				int wrongCount =0;
				if(chase[i].charAt(j)=='W') { //첫 시작이 W이면
					for(int k=i;k<i+8;k++) {
						int bw =0;
							for(int p=j;p<j+8;p++) {
								//System.out.print(chase[k].charAt(p));
								int q=0;
								if(chase[k].charAt(p)!= BWStart[bw].charAt(q)) {
									wrongCount++;		
									q++;
									
								}
								if(bw==0)bw =1;
								else bw=0;
							}
							//System.out.println();
						}
					System.out.println(wrongCount);
				}
				if(chase[i].charAt(j)=='B') { //첫 시작이 W이면
					for(int k=i;k<i+8;k++) {
						int bw =1;
							for(int p=j;p<j+8;p++) {
								//System.out.print(chase[k].charAt(p));
								int q=0;
								if(chase[k].charAt(p)!= BWStart[bw].charAt(q)) {
									wrongCount++;		
									q++;
									
								}
								if(bw==0)bw =1;
								else bw=0;
							}
							//System.out.println();
						}
					
				}System.out.println(wrongCount);
				if(miniWrongCount>wrongCount)miniWrongCount=wrongCount;
			

			}
	}
		System.out.println(miniWrongCount);
	}
}
