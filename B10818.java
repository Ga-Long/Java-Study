import java.util.Scanner;

public class B10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] num =new int[count];
		for(int i =0;i<count;i++) {
			num[i]=sc.nextInt();
		}
		int max = num[0], min= num[0];
		for(int i =1;i<count;i++) {
			if(max<num[i])max=num[i];
			if(min>num[i])min=num[i];
		}
		System.out.println(min + " " + max);
		
		sc.close();

	}

}
