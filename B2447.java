import java.util.*;

public class B2447 {

	static void star(char[][] arr, int x, int y, int N) {//공백으로 된 arr 배열 전달받음
		
		// 더이상 쪼갤 수 없는 블록일 때
		if(N == 1) {
			arr[x][y]='*';
			
		}
		else { //N이 27이면 3*3으로 star(9)를 소한 -> N이 9이면 3*3으로 star(3)를 소환
			//-> N이 3이면 3*3으로 star(1)를 소환
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(i==1 &&j==1)continue;						
					star(arr,x+i*(N/3),y+j*(N/3),N/3);
					//star(arr,9,9,9), star(arr,9,10,9) 
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[][] arr= new char[N][N];
		for (int i = 0; i < arr.length; i++) { //arr배열 초기화
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = ' ';
            }
        }

		star(arr,0,0,N); //공백으로 채워진 arr 이중배열 (0,0)에서 시작
		for (int i = 0; i < arr.length; i++) { //arr출력
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

	}

}
