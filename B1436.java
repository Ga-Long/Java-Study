import java.util.*;

public class B1436 {
	//영화감독 숌
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int endNumber =666; //종말 숫자
		int count = 1; //N번째를 찾아야한다.
		
		int N=sc.nextInt();
		
//		while(true) { //count랑 N이 같으면 break, endNumber 넘겨주기
//			//int sixCount =0; //숫자6 갯수 초기화
//			int numberDigit =0; //몇자리 숫자인지
//			
////			if(count ==N) break;
////			
////			int endNumberDigit = endNumber;
////			while(endNumberDigit != 0) {
////				endNumberDigit /=10;
////				numberDigit++; //자리수
////			}
////			
////			//배열에 숫자 넣기 
////			int[] number = new int[numberDigit];
////			endNumberDigit = endNumber;
////			for(int i =0;i<number.length;i++) {
////				number[i] = endNumber%10;
////				endNumber/=10;
////			}
////			
//			//연속적으로 6이 있나 확인
////			for(int i =number.length-1;i>=0;i--) {
////				if(number[i]==6 && i>2) {
////					if(number[i-1]==6 && i>1) {
////						if(number[i-2]==6) { //6이 연속 3번이면
////						
////							if(number[i-3]==6 && i>3)continue; //6이 연속 4번 이상이면
////							else count++; //count증가
////						}
////					}
////					else continue;
////				}
////				else continue;
////			}
//			for(int i =number.length-1;i>=0;i--) {
//				if(i>3) {
//					if(number[i]==6 && number[i-1]== 6 && number[i-2]==6){//연속으로 6이다
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
