import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int a = commands[i][0];
            int b = commands[i][1];
            int c = commands[i][2];
            List<Integer> arr = new ArrayList<>();
            for (int j = a-1; j < b; j++) {
                arr.add(array[j]);
            }
            arr.sort(Comparator.naturalOrder());
            answer[i] = arr.get(c - 1);
        }
        return answer;
    }
}
