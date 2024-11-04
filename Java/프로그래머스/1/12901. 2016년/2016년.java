class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] arr = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int total = b-1;
        for(int i =0; i<a-1; i++){
            total+=daysInMonth[i];
        }
        answer = arr[total%7];
        return answer;
    }
}