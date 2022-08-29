import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B1620 {
    //나는야 포켓몬 마스터 이다솜

    static boolean isInteger(String find){
        try{
            Double.parseDouble(find); //숫자면
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] arr = new String[N];
        HashMap<String, Integer> map = new HashMap();
        for(int i=0;i<N;i++){
            String name = br.readLine();
            map.put(name,i+1); //key, value 1번부터 시작
            arr[i] = name;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<M;i++){
            String find = br.readLine();
            if(!isInteger(find)){ //key가 있으면, 숫자가 아니면
                sb.append(map.get(find));
            }
            else { //숫자이면
                sb.append(arr[Integer.parseInt(find)-1]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
