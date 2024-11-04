import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int ii = 0; ii < numbers.length; ii++) {
                if(i != ii) {
                    arr.add(numbers[i] + numbers[ii]);
                }
            }
        }

        List<Integer> newList = arr.stream().distinct().sorted().collect(Collectors.toList());

        return newList.stream().mapToInt(Integer::intValue).toArray();
    }
}
