import java.util.Scanner;
//10998
public class B10998 {
	public static int calc(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		int a=0,b=0,result=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			a=sc.nextInt();
			b=sc.nextInt();
			if(a>0&&b<10)break;
			System.out.println("a>0 b<10 Á¶°Ç");
		}
		result=calc(a,b);
		System.out.println(result);
		sc.close();
	}

}
