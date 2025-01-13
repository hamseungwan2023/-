class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 0 % 1234567;
        int b = 1 % 1234567;
        
        for(int i = 2; i <= n; i++) {
            answer = a + b;
            a = b % 1234567;
            b = answer % 1234567;
        }
        
        return answer % 1234567;
    }
}