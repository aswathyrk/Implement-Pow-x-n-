public class Solution {
    public double myPow(double x, int n) {
        if(n==0)
            return 1;
            
        if(n<=Integer.MIN_VALUE){
            return myPow(x, n+1)/x;
        }
     
        if(n<0){
            return 1/myPow(x, -n);
        }
     
        double v = myPow(x, n/2);
     
        if(n%2==0){
           return v*v;
        }else{
           return v*v*x;
        }   
            
    }
}
