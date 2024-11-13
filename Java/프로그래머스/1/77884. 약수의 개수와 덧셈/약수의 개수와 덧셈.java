class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;

        for(int i = left; i<=right; i++){
            for(int ii = 1; ii<=i; ii++){
                if(i % ii == 0){
                    count++;
                }
            }
            if(count % 2 == 0){
                answer += i;
                count = 0;
            } else{
                answer -= i;
                count = 0;
            }
        }
        return answer;
    }
}