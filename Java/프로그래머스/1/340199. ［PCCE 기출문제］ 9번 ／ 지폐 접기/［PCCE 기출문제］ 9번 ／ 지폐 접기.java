import java.util.*;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        // 지갑 크기 정렬
        Arrays.sort(wallet);
        // 지폐 크기 정렬
        Arrays.sort(bill);

        int answer = 0; // 접는 횟수 초기화

        // 지폐 크기가 지갑 크기보다 작아질 때까지 반복
        while (bill[1] > wallet[1] || bill[0] > wallet[0]) {
            // 긴 쪽을 반으로 접음
            bill[1] /= 2; // 항상 bill[1]이 더 크므로 이를 줄임
            answer++; // 접는 횟수 증가

            // bill을 다시 정렬하여 작은 값과 큰 값을 유지
            if (bill[0] > bill[1]) {
                int temp = bill[0];
                bill[0] = bill[1];
                bill[1] = temp;
            }
        }
        
        return answer;
    }
}