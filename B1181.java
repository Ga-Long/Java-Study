import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class B1181 {
    //단어 정렬
    static void wordSort(String[] arr){
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                else{
                    return o1.length() - o2.length();
                }
            }
        });

        //조건
        for(int i=0;i<arr.length;i++){
            if(i==0)    System.out.println(arr[i]);
            if(i>0){
                if(!arr[i-1].equals(arr[i])) System.out.println(arr[i]);
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];

        for(int i=0;i<words.length;i++) words[i] = br.readLine();

        wordSort(words);

    }
}
