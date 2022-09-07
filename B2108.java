import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class B2108 {
	//�����

	static double average(int[] arr) { //���
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		return sum/(arr.length*1.0); //�Ҽ��� �����!!
		
	}
	
	static int middle_value(int[] arr) {//�����ϴ� ������ �������� ��, �߾ӿ� ��ġ�ϴ� ��
		
		return arr[arr.length/2];
	}
	
	static int mode(int[] arr) { //N���� ���� �� ���� ���� ��Ÿ���� ��
		int[] count = new int[8001];
		if(arr.length ==1) return arr[0];
		
		for(int i=0;i<arr.length;i++) {
			count[4000+arr[i]]++;
		}
		
		int findTwo=0; //�ι�°�� ���� �� ���
		int max = 0;
		int finalMax =0;
		for(int i=0;i<count.length;i++) {
			if(count[i]>max) { //�� ū�� ã����
				max=count[i]; //max�� �װɷ�
				finalMax =i;
				findTwo=1; //findTwo�� �ϳ� ã���ɷ�
			}
			else if(count[i]==max && max!=0) { //count[i]�� max�� ����, max�� 0�� �ƴҶ�
				if(findTwo!=2) {
					max = count[i];
					finalMax =i;
					findTwo++;
				}
			}
		}
		
		return finalMax-4000;
	}
	
	static int range(int[] arr) { //�ִ񰪰� �ּڰ��� ����
		
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
		Arrays.sort(arr); //�����ؼ� ������
		
		bw.write(String.valueOf(Math.round((average(arr)))+"\n"));
		bw.write(Integer.toString(middle_value(arr))+"\n");
		bw.write(Integer.toString(mode(arr))+"\n");
		bw.write(Integer.toString(range(arr))+"\n");
		
		bw.flush();
		bw.close();
	}

}
