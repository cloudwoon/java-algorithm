import java.io.*;
import java.util.*;

class Main {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]) answer.add(a[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException, IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] Nnum = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            Nnum[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        int[] Mnum = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            Mnum[i] = Integer.parseInt(st.nextToken());
        }

        for (int x : T.solution(N, M, Nnum, Mnum)) {
            System.out.print(x + " ");
        }
    }
    //시간 초과
}