import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> deploy = new ArrayList<>();

        int[] remainingDays = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            remainingDays[i] = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
        }
        
        int currentDay = remainingDays[0];
        int count = 1;

        for (int i = 1; i < progresses.length; i++) {
            if (remainingDays[i] <= currentDay) {
                count++;
            } else {
                deploy.add(count);
                count = 1;
                currentDay = remainingDays[i];
            }
        }
        deploy.add(count);
        
        return deploy.stream().mapToInt(Integer::intValue).toArray();
    }
}
