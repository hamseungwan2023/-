import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            if(arr.size() < k) {
                arr.add(score[i]);
            }
            arr.sort(Comparator.reverseOrder());
            if(arr.size() == k && i >= k && arr.get(k -1) < score[i]) {
                arr.remove(k - 1);
                arr.add(score[i]);
            }
            arr.sort(Comparator.reverseOrder());
            answer[i] = arr.get(arr.size() - 1);
        }
        return answer;
    }
}