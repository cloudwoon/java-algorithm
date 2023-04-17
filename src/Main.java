import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void solution(int n, int m, int[] cards) {
        int max = 0;
        for (int i = 0; i < n ; i++){
            for (int j = i+1; j < n; j++){
                for (int k = j+1; k < n ; k++){
                    if (cards[i] + cards[j] + cards[k] <= m) {
                        if (cards[i] + cards[j] + cards[k] > max) max = cards[i] + cards[j] + cards[k];
                    }
                }
            }
        }
        System.out.print(max);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] cards = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        solution(n,m,cards);
    }
}