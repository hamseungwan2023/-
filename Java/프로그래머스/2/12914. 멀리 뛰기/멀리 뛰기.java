/**
 * 피보나치사용하기
 */
class Solution {
    public long solution(int n) {
        return fibo(n);
    }
    
    public int fibo(int n) {
        
        if(n == 1){
            return 1;
        } 
        if(n == 2) {
            return 2;
        }
        
        int a = 1;
        int b = 2;
        int result = 0;
        
        for(int i = 3; i<n+1; i++){
            result = (a+b) % 1234567;
            a = b;
            b = result;
        }
        
        return result;
    }
}