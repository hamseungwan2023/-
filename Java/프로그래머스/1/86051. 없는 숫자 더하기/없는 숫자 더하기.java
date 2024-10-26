class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] numList = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int a = 0;
        int b = 0;
        for (int i = 0; i < numbers.length; i++) {
            a += numbers[i];
        }
        for (int i = 0; i < numList.length; i++) {
            b += numList[i];
        }
        answer = b - a;
        return answer;
    }
}