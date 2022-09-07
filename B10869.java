import java.util.Scanner;
//10869
public class B10869 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		while(true) {
			a=sc.nextInt();
			b=sc.nextInt();
			if(a>=1 && b<=10000)break; 
			System.out.println("a>=1 b<=10000 Á¶°Ç");
		}
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		sc.close();
	}

}
