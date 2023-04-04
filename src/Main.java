import java.io.*;
import java.util.StringTokenizer;

class Main {
    public int solution(int num, int[][] classNum) {
        int answer = 0;
        int max = 0;
        for (int i = 0; i < num; i++) {
            int count = 0;
            for (int k = 0; k < 5; k++) {
                for (int j = 1; j < num; j++) {
                    if (classNum[i][k] == classNum[j][k]) count++;
                }
                if (count > max) max = count;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] classNum = new int[N][5];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < 5; k++) {
                classNum[i][k] = Integer.parseInt(st.nextToken());
            }
        }
        bw.write(String.valueOf(T.solution(N, classNum)));
        bw.flush();
        bw.close();
    }

    //오답
}