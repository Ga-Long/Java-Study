import java.util.Scanner;

public class B2577 {

	public static void main(String[] args) {
		int[] num = new int[10];
		int multiply=0;
		Scanner sc = new Scanner(System.in);
		//�Է¹ް� , �迭 �ȿ� �� �� 0���� 
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		//���ϰ�
		multiply = a*b*c;
		do {
			num[multiply%10]++; //������ ���°� �迭�� +1
			multiply = multiply /10; // �ڸ��� ��ŭ ������
		}while(multiply!=0);
		for(int i =0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		sc.close();

	}

}
