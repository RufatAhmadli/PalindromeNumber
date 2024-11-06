public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.fib(6));
    }
    static class Solution {
        public int fib(int n) {
            if(n==0)return 0;
            int a=0;
            int b=1;
            for(int i=2;i<=n;i++){
                int copy=b;
                b=b+a;
                a=copy;
            }
            return b;
        }
    }
}