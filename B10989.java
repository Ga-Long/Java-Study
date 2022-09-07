import java.io.*;

public class B10989 {
	//카운팅 정렬 
	static void counting_sort(int arr[]) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] counting = new int[10001];
		int[] result = new int[arr.length];
		for(int i=0;i<arr.length;i++) { //array-> counting
			counting[arr[i]]++;
		}
		
		for(int i=0;i<counting.length-1;i++) { //count+1
			counting[i+1] += counting[i];
		}
		
		for(int i =arr.length-1;i>=0;i--) {
			counting[arr[i]] -=1;
			int index = counting[arr[i]];
		
			result[index] = arr[i];
			//bw.write("result[" + Integer.toString(index) + "]는" + Integer.toString(result[index]));
		}
		for(int i=0;i<result.length;i++) {
			if(result[i]!=0)
				bw.write(Integer.toString(result[i])+ "\n");
		}
		
		bw.flush();
		bw.close();
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bf.readLine());
		int[] arr = new int[N];
		
		for(int i =0;i<arr.length;i++) {
			arr[i]= Integer.parseInt(bf.readLine());
		}
		
		counting_sort(arr);
		
	}

}
