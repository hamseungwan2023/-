class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String a = "";
        long b = Long.parseLong(p);

        for(int i = 0; i<t.length(); i++){
            a+= t.charAt(i);
            if(p.length() == a.length()){
                if(Long.parseLong(a) <= b){
                    answer++;
                }
                i = i-p.length()+1;
                a = "";
            }
        }
        return answer;
    }
}