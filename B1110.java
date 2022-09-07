import java.util.Scanner;

public class B1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length=0;
		int n=sc.nextInt();
		int newNum=n;
		if(n>=0 && n<=99) {
			while(true) {
				int left = newNum/10;
				int right = newNum%10;
				newNum = (right*10)+(left+right)%10;
				length++;
				if(newNum==n)break;
			}
		}
		
		System.out.println(length);
		sc.close();
		
	}

}
