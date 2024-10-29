class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i = 0; i<arr1.length; i++){
            for(int ii = 0; ii<arr1[0].length; ii++){
                answer[i][ii] = arr1[i][ii] + arr2[i][ii];
            }
        }
        return answer;
    }
}