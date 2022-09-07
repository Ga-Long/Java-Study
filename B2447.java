import java.util.*;

public class B2447 {

	static void star(char[][] arr, int x, int y, int N) {//�������� �� arr �迭 ���޹���
		
		// ���̻� �ɰ� �� ���� ����� ��
		if(N == 1) {
			arr[x][y]='*';
			
		}
		else { //N�� 27�̸� 3*3���� star(9)�� ���� -> N�� 9�̸� 3*3���� star(3)�� ��ȯ
			//-> N�� 3�̸� 3*3���� star(1)�� ��ȯ
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
		for (int i = 0; i < arr.length; i++) { //arr�迭 �ʱ�ȭ
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = ' ';
            }
        }

		star(arr,0,0,N); //�������� ä���� arr ���߹迭 (0,0)���� ����
		for (int i = 0; i < arr.length; i++) { //arr���
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

	}

}
