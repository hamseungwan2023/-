import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (arr.size() < k) {
                arr.add(score[i]);
                arr.sort((a, b) -> a - b);
                answer[i] = arr.get(0);
            } else if (arr.get(0) > score[i]) {
                answer[i] = arr.get(0);
            } else {
                arr.remove(0);
                arr.add(score[i]);
                arr.sort((a, b) -> a - b);
                answer[i] = arr.get(0);
            }
        }
        return answer;
    }
}