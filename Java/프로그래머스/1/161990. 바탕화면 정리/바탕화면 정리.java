import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int row = wallpaper[0].length();
        int column = wallpaper.length;
        List<Integer> rowArr = new ArrayList<>();
        List<Integer> columnArr = new ArrayList<>();
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    rowArr.add(i);
                    columnArr.add(j);
                }
            }
        }
        int minRow = Collections.min(rowArr);
        int minColumn = Collections.min(columnArr);
        int maxRow = Collections.max(rowArr);
        int maxColumn = Collections.max(columnArr);

        answer[0] = minRow;
        answer[1] = minColumn;
        answer[2] = maxRow + 1;
        answer[3] = maxColumn + 1;
        return answer;
    }
}