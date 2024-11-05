class Solution {
    public String solution(String s) {
        String answer ="";
        int a = 0;

        for(int i = 0; i<s.length();i++){

            if(s.charAt(i) == ' '){
                answer += " ";
                a = 0;
            } else{
                if(a % 2 == 0){
                    answer+=String.valueOf(s.charAt(i)).toUpperCase();
                } else{
                    answer+=String.valueOf(s.charAt(i)).toLowerCase();
                }
                a++;
            }
        }
        return answer;
    }
}