import java.util.Scanner;

public class B2577 {

	public static void main(String[] args) {
		int[] num = new int[10];
		int multiply=0;
		Scanner sc = new Scanner(System.in);
		//입력받고 , 배열 안에 값 다 0으로 
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		//곱하고
		multiply = a*b*c;
		do {
			num[multiply%10]++; //나누고 나온값 배열에 +1
			multiply = multiply /10; // 자리수 만큼 나눈다
		}while(multiply!=0);
		for(int i =0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		sc.close();

	}

}
