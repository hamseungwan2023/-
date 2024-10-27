import java.util.*;

public class Solution {
    public int solution(int n) {
        int jump = 0;
        do{
            if(n%2==0){
                n/=2;
            } else {
                n-=1;
                jump++;
            }
        }while(n>0);
        return jump;
    }
}
