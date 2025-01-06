class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] result = new String[n];
        
        for (int i = 0; i < n; i++) {
            String str1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
            String str2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');

            StringBuilder str = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (str1.charAt(j) == '1' || str2.charAt(j) == '1') {
                    str.append("#");
                } else {
                    str.append(" ");
                }
            }
            result[i] = str.toString();
        }
        
        return result;
    }
}
