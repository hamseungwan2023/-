class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = maxYaksu(n, m);
        answer[1] = minBesu(n, m);
        return answer;
    }

    public int maxYaksu(int a, int b) {
        int min = Math.min(a, b);
        int c = 0;
        for (int i = 1; i <=min; i++) {
            if (a % i == 0 && b % i == 0) {
                c= i;
            }
        }
        return c;
    }

    public int minBesu(int a, int b) {
        int c = maxYaksu(a, b);
        return a * b / c;
    }
}
