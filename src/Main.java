import java.util.*;

class Main {
    public int solution(int n, int[] a) {
        int answer = 0;
        int cnt = 0;
        for(int i = 0; i < n ; i++){
            if(a[i] == 1){
                cnt++;
                answer +=cnt;
            }else cnt = 0;
        }
        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
    System.out.println(T.solution(n,a));
    }
}
