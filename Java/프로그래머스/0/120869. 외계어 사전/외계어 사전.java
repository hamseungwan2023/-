import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int count = 0;
        Arrays.sort(spell);
        for (int i = 0; i < dic.length; i++) {
            if (spell.length == dic[i].length()) {
                String[] sort = dic[i].split("");
                Arrays.sort(sort);
                for (int j = 0; j < spell.length; j++) {
                    if(spell[j].equals(sort[j])){
                        count++;
                    }
                }
                if(count == spell.length){
                    answer = 1;
                }
                count = 0;
            }
        }
        return answer;
    }
}