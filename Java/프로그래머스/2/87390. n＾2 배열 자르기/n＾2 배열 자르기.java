class Solution {
    public int[] solution(int n, long left, long right) {
        // result 배열을 결과 크기만큼 할당
        int size = (int) (right - left + 1);
        int[] answer = new int[size];

        // left부터 right까지 값 계산하여 저장
        for (long i = left; i <= right; i++) {
            int row = (int) (i / n);  // 행 번호
            int col = (int) (i % n);  // 열 번호
            answer[(int) (i - left)] = Math.max(row + 1, col + 1);  // 행과 열 번호 중 큰 값을 저장
        }
        return answer;
    }
}
