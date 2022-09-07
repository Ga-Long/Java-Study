import java.io.*;

public class B2750 {
	//»ğÀÔÁ¤·Ä
	static void insertion_sort(int arr[]) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int j,key;
		for(int i=0;i<arr.length;i++) {
			key = arr[i];
			for(j=i-1; j>=0 && arr[j]>key; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1]=key;
		}
		
		for(int i=0;i<arr.length;i++) {
			bw.write(Integer.toString(arr[i])+ "\n");
		}
		bw.flush();
		bw.close();
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		int[] arr = new int[N];
		
		for(int i =0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
	
		insertion_sort(arr);

	}

}
