import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new TreeSet<>();
        int a = 2;
        int b = n;
        while(true) {
            if(b == 1) {
                break;
            }
            if(b % a == 0) {
                b = b/a;
                set.add(a);
            } else {
                a++;
            }
        }

        int[] answer = new int[set.size()];
        int idx = 0;
        for(Integer element : set) {
            answer[idx++] = element;
        }

        return answer;
    }
}