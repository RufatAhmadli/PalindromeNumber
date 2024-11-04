public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.smallestEvenMultiple(122));
    }
    static class Solution {
        public int smallestEvenMultiple(int n) {
            if(n%2==0)return n;
            else return n*2;

        }
    }
}