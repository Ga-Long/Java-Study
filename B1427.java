import java.io.*;
import java.util.Arrays;

public class B1427 {
	//소트인사이드
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] arr = bf.readLine().toCharArray();
		
		Arrays.sort(arr);
		
		for(int i=arr.length-1;i>=0;i--) {
			bw.write(arr[i]);
		}
		
		bw.flush();
		bw.close();
	}

}
