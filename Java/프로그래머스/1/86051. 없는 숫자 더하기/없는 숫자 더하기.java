class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < numbers.length; i++) {
            a += numbers[i];
        }
        
        answer = 45 - a;
        return answer;
    }
}