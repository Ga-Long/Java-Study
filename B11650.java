import java.util.*;
import java.io.*;

public class B11650 {
	//좌표 정렬하기
	
	static void twoDSort(int[][] arr) { //삽입정렬로
//		int j;
//		int[][] key = new int[1][2];
//		for(int i=1;i<arr.length;i++) {
//			key[0][0] = arr[i][0];
//			key[0][1] = arr[i][1];
//			for(j=i-1; j>=0&&arr[j][0]>=key[0][0]; j--) {
//				if(arr[j][0]>key[0][0]) {
//					arr[j+1][0] = arr[j][0];
//					arr[j+1][1] = arr[j][1];
//				}
//				else if(arr[j][0]==key[0][0]) {
//					if(arr[j][1]>key[0][1]) {
//						arr[j+1][0] = arr[j][0];
//						arr[j+1][1] = arr[j][1];
//					}
//				}
//				
//			}
//			arr[j+1][0]=key[0][0];
//			arr[j+1][1]=key[0][1];
//			
//		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) { //x,y좌표가 같으면 y가 큰걸로 정렬
					return o1[1] - o2[1];
				}
				else {
					return o1[0] - o2[0];
				}
			}
		});
		
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<2;k++) {
				System.out.print(arr[i][k] + " ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[][] direction = new int[N][2];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			direction[i][0] = Integer.parseInt(st.nextToken());
			direction[i][1] = Integer.parseInt(st.nextToken());
		}
		
		twoDSort(direction);

	}

}
