import java.io.*;
import java.util.*;

public class B2751 {
	//array.sort...
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		int[] arr = new int[N];
		
		for(int i =0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
	
		Arrays.sort(arr); 

        for(int i=0;i<arr.length;i++) {
			bw.write(Integer.toString(arr[i])+ "\n");
		}
		bw.flush();
		bw.close();
	}

}