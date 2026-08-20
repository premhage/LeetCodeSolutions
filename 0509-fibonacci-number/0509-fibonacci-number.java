class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }

        int last=fib(n-1);
        int last2=fib(n-2);

        return last+last2;
    }
}