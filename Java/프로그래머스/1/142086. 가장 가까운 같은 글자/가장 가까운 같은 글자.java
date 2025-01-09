import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<String,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            String a = String.valueOf(s.charAt(i));

            if(hashMap.containsKey(a)) {
                answer[i] = i - hashMap.get(a);
            } else {
                answer[i] = -1;
            }
            hashMap.put(a, i);
        }
        return answer;
    }
}