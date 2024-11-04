public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.isPalindrome(123));
    }
    static class Solution {
        public boolean isPalindrome(int x) {
            if(x<0)return false;
            long rev=0;
            long copy=x;
            while(x>0){
                rev=rev*10+x%10;
                x/=10;
            }
            if(rev==copy)return true;
            return false;
        }
    }
}