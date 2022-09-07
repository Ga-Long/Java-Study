import java.util.Scanner;

public class B2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int j=1;//최대값이 1일때 고려. 
	      int[] num =new int[9];
	      for(int i =0;i<num.length;i++){
	         num[i] = sc.nextInt();
	      }
	      int max = num[0];
	      for(int i=1;i<num.length;i++){
	         if(max<num[i]){
	            max=num[i];
	            j=i+1;
	         }
	      }
	      System.out.println(max);
	      System.out.println(j);
	      sc.close();

	}

}
