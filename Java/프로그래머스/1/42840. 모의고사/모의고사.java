import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        List<Integer> arr = new ArrayList<>();
        int aResult = getResult(answers, a);
        int bResult = getResult(answers, b);
        int cResult = getResult(answers, c);
        int[] scores = {aResult, bResult, cResult};
        int maxScores = Arrays.stream(scores).max().getAsInt();
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] == maxScores){
                arr.add(i + 1);
            }
        }
        int[] answer = new int[arr.size()];
        if(arr.size() == 1){
            answer[0] = arr.get(0);
        } else if (arr.size() == 2){
            answer[0] = arr.get(0);
            answer[1] = arr.get(1);
        } else if (arr.size() == 3){
            answer[0] = arr.get(0);
            answer[1] = arr.get(1);
            answer[2] = arr.get(2);
        }

        return answer;
    }

    public int getResult(int[] answer, int[] member) {
        int count = 0;

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == member[i % member.length]) {
                count++;
            }
        }
        return count;
    }
}
