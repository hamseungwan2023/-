import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String low ="";
        String up = "";

        String[] arr = s.split("");
        Arrays.sort(arr, (a,b) -> b.compareTo(a));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(arr[i].toLowerCase())) {
                low += arr[i];
            } else if (arr[i].equals(arr[i].toUpperCase())) {
                up+= arr[i];
            }
        }
        answer = low+up;
        return answer;
    }
}
