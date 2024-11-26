class Solution {

    static int moveCount = 0;

    public int[][] solution(int n) {
        int maxMove = (int) Math.pow(2, n) - 1;
        int[][] answer = new int[maxMove][2];

        move(n, 1, 3, 2, answer);
        return answer;
    }

    public void move(int n, int from, int to, int aux, int[][] answer) {
        if (n == 1) {
            answer[moveCount][0] = from;
            answer[moveCount][1] = to;
            moveCount++;
            return;
        }

        move(n - 1, from, aux, to, answer);

        answer[moveCount][0] = from;
        answer[moveCount][1] = to;
        moveCount++;
        move(n - 1, aux, to, from, answer);
    }
}