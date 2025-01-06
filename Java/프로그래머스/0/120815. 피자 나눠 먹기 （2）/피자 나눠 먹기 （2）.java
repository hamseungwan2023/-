class Solution {
    public int solution(int n) {
        int answer = 1;
        int num = n;
        while(true) {
            if(num % 6 == 0) {
                break;
            }
            
            answer++;
            num = n * answer;
        }
        int result = num / 6;
        return result;
    }
}