import java.util.Scanner;

public class B17478 {

	public static void recursion(int n,int count) {
		int c = count;
		for(int i=0;i<c;i++ ) 
			System.out.print("____");
		System.out.println("\"����Լ��� ������?\"");
		
		if(n==0) {
			for(int i=0;i<c;i++ ) 
				System.out.print("____");
			System.out.println("\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
		}
		if(n>0) {
			for(int i=0;i<c;i++ ) 
				System.out.print("____");
			System.out.println("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
			for(int i=0;i<c;i++ ) 
				System.out.print("____");
			System.out.println("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
			for(int i=0;i<c;i++ ) 
				System.out.print("____");
			System.out.println("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
			
			recursion(n-1,c+1);
		}
		
		for(int i=0;i<c;i++ ) 
			System.out.print("____");
		System.out.println("��� �亯�Ͽ���.");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		recursion(N,0);

		
		sc.close();
	}

}
