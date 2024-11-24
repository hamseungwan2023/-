import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int smallCase = sides[1] - sides[0];
        int bigCase = sides[1] + sides[0];
        for (int i = smallCase+1; i <bigCase; i++) {
            answer++;
        }
        return answer;
    }
}