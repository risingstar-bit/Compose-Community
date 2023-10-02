class Solution {
public:
    double myPow(double x, int n) {
        long long temp = n;
        double res=1;
        if(n<0){
            temp = -temp;
        }
        while(temp>0){
            if(temp%2){
                res = res*x;
            }
            
            x = x*x;
            temp = temp/2;
        }
        
        if(n<0){
            res = 1/res;
        }
        return res;
    }
};
