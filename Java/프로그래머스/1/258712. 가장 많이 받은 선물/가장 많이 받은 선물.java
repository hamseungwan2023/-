import java.util.Arrays;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;

        int[] giftCount = new int[friends.length]; // 선물지수
        String[][] giftBro = new String[gifts.length][]; // 각 선물마다 쪼갠 결과를 저장할 배열

        // 각 gift를 쪼개고 giftBro에 저장
        for (int i = 0; i < gifts.length; i++) {
            // 공백을 기준으로 쪼개기
            giftBro[i] = gifts[i].split(" ");
        }


        for (int i = 0; i < friends.length; i++) {
            int give = 0;
            int get = 0;
            for (int ii = 0; ii < giftBro.length; ii++) {
                if (friends[i].equals(giftBro[ii][0])) {
                    give++;
                }
                if (friends[i].equals(giftBro[ii][1])) {
                    get++;
                }
            }
            giftCount[i] = give - get;
            give = 0;
            get = 0;
        }
        int [] arr = new int[friends.length];
        for (int i = 0; i < friends.length; i++) {

            int aReceiveCount = 0;
            int bReceiveCount = 0;
            for (int ii = 0; ii < friends.length; ii++) {
                int aCount = 0;
                int bCount = 0;
                if (i != ii) {
                    String friendA = friends[i];
                    String friendB = friends[ii];
                    for (int iii = 0; iii < giftBro.length; iii++) {
                        if (giftBro[iii][0].equals(friendA) && giftBro[iii][1].equals(friendB)) {
                            aCount++;
                        } else if (giftBro[iii][0].equals(friendB) && giftBro[iii][1].equals(friendA)) {
                            bCount++;
                        }
                    }
                    if (aCount > bCount) {
                        aReceiveCount++;
                    } else if (aCount == bCount) {
                        if (giftCount[i] > giftCount[ii]) {
                            bReceiveCount++;
                        }
                    }
                }
            }
        arr[i] = aReceiveCount+bReceiveCount;
        }
        answer =  Arrays.stream(arr).max().getAsInt();
        return answer;
    }
}