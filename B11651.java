import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B11651 {
	//좌표 정렬하기2
	
	static void twoDSort(int[][] arr) { //삽입정렬로
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) { //x,y좌표가 같으면 y가 큰걸로 정렬
					return o1[0] - o2[0];
				}
				else {
					return o1[1] - o2[1];
				}
			}
		});
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

	}

}
