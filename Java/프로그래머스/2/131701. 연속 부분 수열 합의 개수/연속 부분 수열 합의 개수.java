import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < elements.length; i++) {
            int b = 0;
            for (int ii = 0; ii < elements.length; ii++) {
                b += elements[(i + ii) % elements.length];
                a.add(b);
            }
        }
        return a.size();
    }
}
