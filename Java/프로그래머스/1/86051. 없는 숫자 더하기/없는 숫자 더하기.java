class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        int a = 0;
        for (int i = 0; i < numbers.length; i++) {
            a += numbers[i];
        }
        
        return answer - a;
    }
}
