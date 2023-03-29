import java.util.*;

class Main {
    public int[] solution(int n, int m, int[] nNum, int[] mNum) {
        int[] answer = new int[m];

        for (int i = 0; i < m ; i++){
            int t = 0;
            for (int k = 0; k<n;k++){
                if(mNum[i] == nNum[k]) t = 1;
            }
            answer[i] = t;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] nNum = new int[n];
        for (int i = 0; i < n; i++) {
            nNum[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] mNum = new int[m];
        for (int i = 0; i < m; i++) {
            mNum[i] = kb.nextInt();
        }

        for (int i : T.solution(n,m,nNum,mNum)){
            System.out.print(i + " ");
        }

        //시간초과
    }
}