import java.util.Scanner;
//1000
public class B1000 {
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		int a=0,b=0,sum=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a>0 && b<10)break;
			System.out.println("a>0 b<10 Á¶°Ç");
		}
	
		sum = sum(a,b);
		System.out.println(sum);
	
		sc.close();
			
	}
}
