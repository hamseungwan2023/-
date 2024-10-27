import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, String[] words) {
        List<String> wordList= new ArrayList<>();
        wordList.add(words[0]);
        for(int i =1; i<words.length; i++){
            String word = words[i];

            if(wordList.contains(word)){
                return new int[] {i%n+1, i/n+1};
            }
            String beforeWord = words[i-1];
            if(beforeWord.charAt(beforeWord.length()-1) != word.charAt(0)){
                return new int[] {i%n+1, i/n+1};
            }
            
            wordList.add(word);
        }

        return new int[] {0,0};
    }
}