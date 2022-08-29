import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B10814 {
    //나이순 정렬
    static void joinSort(String[][] arr) { //삽입정렬로
        Arrays.sort(arr, new Comparator<String[]>() {
            public int compare(String[] o1, String[] o2) {

                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);

            }
        });
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[0].length; k++) {
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        String[][] person = new String[N][2];

        for (int i = 0; i < person.length; i++) {
            st = new StringTokenizer(br.readLine());
            person[i][0] = st.nextToken();
            person[i][1] = st.nextToken();

        }
        joinSort(person);

    }
}