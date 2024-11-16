import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        for (int i = 0; i < arr.length; i++) {
            char first = arr[0];
            if(isValid(arr)){
                answer++;
            }
            for(int ii = 1; ii<arr.length; ii++){
                arr[ii -1] = arr[ii];
            }
            arr[arr.length - 1] = first;

        }
        System.out.println(answer);
        return answer;
    }

    public boolean isValid(char[] s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}