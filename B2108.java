import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class B2108 {
	//통계학

	static double average(int[] arr) { //평균
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		return sum/(arr.length*1.0); //소수점 만들기!!
		
	}
	
	static int middle_value(int[] arr) {//증가하는 순서로 나열했을 때, 중앙에 위치하는 값
		
		return arr[arr.length/2];
	}
	
	static int mode(int[] arr) { //N개의 수들 중 가장 많이 나타나는 값
		int[] count = new int[8001];
		if(arr.length ==1) return arr[0];
		
		for(int i=0;i<arr.length;i++) {
			count[4000+arr[i]]++;
		}
		
		int findTwo=0; //두번째로 작은 값 출력
		int max = 0;
		int finalMax =0;
		for(int i=0;i<count.length;i++) {
			if(count[i]>max) { //더 큰거 찾으면
				max=count[i]; //max는 그걸로
				finalMax =i;
				findTwo=1; //findTwo는 하나 찾은걸로
			}
			else if(count[i]==max && max!=0) { //count[i]가 max랑 같고, max가 0이 아닐때
				if(findTwo!=2) {
					max = count[i];
					finalMax =i;
					findTwo++;
				}
			}
		}
		
		return finalMax-4000;
	}
	
	static int range(int[] arr) { //최댓값과 최솟값의 차이
		
		if(arr.length ==1) return 0;
		
		int min= arr[0]; 
		int max = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) min = arr[i];
			if(arr[i]>max) max = arr[i];
		}
		
		return max-min;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		int[] arr = new int[N];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(bf.readLine());
			
		}
		Arrays.sort(arr); //정렬해서 보내기
		
		bw.write(String.valueOf(Math.round((average(arr)))+"\n"));
		bw.write(Integer.toString(middle_value(arr))+"\n");
		bw.write(Integer.toString(mode(arr))+"\n");
		bw.write(Integer.toString(range(arr))+"\n");
		
		bw.flush();
		bw.close();
	}

}
