import java.util.*;

public class B1436 {
	//��ȭ���� ��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int endNumber =666; //���� ����
		int count = 1; //N��°�� ã�ƾ��Ѵ�.
		
		int N=sc.nextInt();
		
//		while(true) { //count�� N�� ������ break, endNumber �Ѱ��ֱ�
//			//int sixCount =0; //����6 ���� �ʱ�ȭ
//			int numberDigit =0; //���ڸ� ��������
//			
////			if(count ==N) break;
////			
////			int endNumberDigit = endNumber;
////			while(endNumberDigit != 0) {
////				endNumberDigit /=10;
////				numberDigit++; //�ڸ���
////			}
////			
////			//�迭�� ���� �ֱ� 
////			int[] number = new int[numberDigit];
////			endNumberDigit = endNumber;
////			for(int i =0;i<number.length;i++) {
////				number[i] = endNumber%10;
////				endNumber/=10;
////			}
////			
//			//���������� 6�� �ֳ� Ȯ��
////			for(int i =number.length-1;i>=0;i--) {
////				if(number[i]==6 && i>2) {
////					if(number[i-1]==6 && i>1) {
////						if(number[i-2]==6) { //6�� ���� 3���̸�
////						
////							if(number[i-3]==6 && i>3)continue; //6�� ���� 4�� �̻��̸�
////							else count++; //count����
////						}
////					}
////					else continue;
////				}
////				else continue;
////			}
//			for(int i =number.length-1;i>=0;i--) {
//				if(i>3) {
//					if(number[i]==6 && number[i-1]== 6 && number[i-2]==6){//�������� 6�̴�
//						count++;
//						break;
//					}
//				}
//				
//			}
//			
//			endNumber++;
//			
//			
//		}
		while(count != N) {
			endNumber++;
			if(String.valueOf(endNumber).contains("666")) {
				count++;
			}
			
		}
		
		System.out.println(endNumber);
				

	}

}
