class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        Long pNum = Long.parseLong(p);        
        String a = "";
        String [] arr = t.split("");
        for(int i = 0; i < t.length() - p.length() + 1; i++) {
            for(int j = i; j < i + p.length(); j++) {
                a += arr[j];
            }
            if(Long.parseLong(a) <= pNum) {
                answer++;
            }
            a = "";
        }
        return answer;
    }
}