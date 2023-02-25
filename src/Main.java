import java.util.*;

public class Main {

    public String solution(String s) {
        String answer = "";
        //char answer[] = new char[s.length()];
        char c = ' '; //이전 알파벳
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                //이전 알파벳과 현재 알파벳이 같을 때
                count++; //몇 번 연속하는지 카운트 올리기
            } else {
                //현재 알파벳과 이전 알파벳이 다를 때
                if(count == 1){
                    answer = answer + s.charAt(i); //알파벳 넣어주기
                }else {
                    answer = answer + count + s.charAt(i);
                    count = 1;
                }
            }
             c = s.charAt(i);
        }
        if(count!=1) answer = answer + count;

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}