import java.util.Scanner;
//1001
public class B1001 {
	public static int diff(int a, int b) {
		return a-b;
	}
	
	public static void main(String[] args) {
		int a=0,b=0,diff=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a>0 && b<10)break;
			System.out.println("a>0 b<10 Á¶°Ç");
		}
		diff = diff(a,b);
		System.out.println(diff);
		sc.close();
	}

}
