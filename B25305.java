import java.io.*;
import java.util.*;

public class B25305 {
	//커트라인
	static int cutLine(int[] arr, int cut) {
		
		Arrays.sort(arr);
		
		return arr[arr.length-cut];
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cut = sc.nextInt();
		
		int[] score = new int[N];
		
		
		for(int i =0;i<score.length;i++) {
			score[i] = sc.nextInt();
		}
		
		System.out.println(cutLine(score,cut));
	}

}
