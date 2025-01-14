import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};

        for (String babble : babbling) {
            boolean isValid = true;
            String lastWord = "";
            while (!babble.isEmpty()) {
                boolean matched = false;
                for (String word : words) {
                    if (babble.startsWith(word)) {
                        if (lastWord.equals(word)) {
                            isValid = false;
                            break;
                        }
                        babble = babble.substring(word.length());
                        lastWord = word;
                        matched = true;
                        break;
                    }
                }
                if (!matched) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) answer++;
        }
        return answer;
    }
}