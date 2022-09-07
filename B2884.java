import java.util.Scanner;

public class B2884 {

	public static void main(String[] args) {
		int h,m;
		Scanner sc = new Scanner(System.in);
		while(true) {
			h=sc.nextInt();
			m=sc.nextInt();
			if((h>=0 && h<=23)&&(m>=0&&m<=59))break;
		}
		if(m-45<0) {
			if(h-1<0) {
				h=23;
			}
			else {
				h-=1;
			}
			m = m+60-45;
			System.out.println(h+" "+m);
		}
		else {
			m-=45;
			System.out.println(h+" "+m);
		}
		
		sc.close();
	}

}
