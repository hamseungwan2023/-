class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] q = new String[n];
        String[] w = new String[n];

        for (int i = 0; i < arr1.length; i++) {

            String a = Integer.toBinaryString(arr1[i]);
            String b = String.format("%" + n + "s", a).replace(" ", "0");

            String c = Integer.toBinaryString(arr2[i]);
            String d = String.format("%" + n + "s", c).replace(" ", "0");

            answer[i] = "";
            q[i] = b;
            w[i] = d;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (q[i].charAt(j) == '1' || w[i].charAt(j) == '1'){
                    answer[i] += "#";
                } else{
                    answer[i] += " ";
                }
            }
        }

        return answer;
    }
}