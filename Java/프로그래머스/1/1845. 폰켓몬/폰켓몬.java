import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> type = new HashSet<>();
        for(int num : nums){
            type.add(num);
        }
        int max = nums.length / 2;
        if(type.size() > max){
            return max;
        }
        answer = type.size();
        return answer;
    }
}