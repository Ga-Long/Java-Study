import java.util.Scanner;

public class B10870 {
	public static int fibonacci(int n) {
		int f=0;
		if(n==0)return 0;
		if(n==1)return 1;
		
		f=fibonacci(n-1)+fibonacci(n-2);
		//System.out.println(f);
		
		return f;
	}
	
	public static void main(String[] args) {
		int f=0;
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		f = fibonacci(n);
		System.out.println(f);
		
		sc.close();
	}

}
