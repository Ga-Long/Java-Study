import java.util.InputMismatchException;
import java.util.Scanner;
//1008
public class B1008{
	public static int calc(int a, int b){
		return a/b;
	}
	public static void main(String[] args) {
		double a,b;
		double result=0;
		Scanner sc=new Scanner(System.in);
		
		try {
			a=sc.nextDouble();
			b=sc.nextDouble();
			if(a>0 && b<10)
					result = a/b;
			else
				System.out.println("a>0 b<10 조건");
				
		}catch(InputMismatchException ime) {
			System.out.println("정수만 입력");
				
		}catch(ArithmeticException e) {
			result=-1;
		}
		
		System.out.println(result);
		sc.close();
	}
}
