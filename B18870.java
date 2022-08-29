import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B18870 {
    //좌표 압축
    static void compression(int[] arr, int[] origin) throws IOException {
        //정렬하고 그 뒤에 몇개 있는지 count
        HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
        StringBuilder sb = new StringBuilder();

        int rank =0;
        for(int v: arr){
            if(!count.containsKey(v)){//중복되지 않게
                count.put(v,rank);
                rank++;
            }
        }

        for(int i=0;i<arr.length;i++){
            sb.append(count.get(origin[i])).append(" ");
        }
        System.out.println(sb);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(br.readLine());
        int[] XY = new int[N];
        int[] sortXY = new int[N];

        for(int i=0;i<XY.length;i++){
            XY[i] = sortXY[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sortXY);

        compression(sortXY,XY);
    }
}
