import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B10816 {
    //숫자 카드2

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(st.nextToken());

            if(hash.get(num) == null) hash.put(num, 1); //key값이 null이면 입력
            else hash.put(num, hash.get(num) + 1); //null이 아니면 key값 +1
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<M;i++){
            int find = Integer.parseInt(st.nextToken());
            if(hash.get(find) == null) sb.append(0).append(" ");
            else sb.append(hash.get(find)).append(" ");
        }

        System.out.println(sb);

    }
}
