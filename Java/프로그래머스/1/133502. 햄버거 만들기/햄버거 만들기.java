import java.util.*;

/**
 * 스택을 사용해서 만들기
 */
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> burger = new Stack<>();
        for (int i = 0; i < ingredient.length; i++) {
            burger.push(ingredient[i]);

            if (burger.size() >= 4 &&
                    burger.get(burger.size() - 1) == 1 &&
                    burger.get(burger.size() - 2) == 3 &&
                    burger.get(burger.size() - 3) == 2 &&
                    burger.get(burger.size() - 4) == 1) {
                burger.pop();
                burger.pop();
                burger.pop();
                burger.pop();
                answer++;
            }
        }
        return answer;
    }
}