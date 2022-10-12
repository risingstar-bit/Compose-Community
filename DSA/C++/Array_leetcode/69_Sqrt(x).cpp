//69. Sqrt(x)

class Solution {
public:
 int mySqrt(int x) {
  long long s=0, e=x, ans, mid;   //long long due to some of test cases overflows                                   integer limit.
        while(s<=e){             
            mid=(s+e)/2;
            if(mid*mid==x) return mid;     //if the 'mid' value ever gives the                                                  result, we simply return it.
            else if(mid*mid<x){             
                s=mid+1;        //if 'mid' value encounterted gives lower result, we                                  simply discard all the values lower than mid.
                ans=mid;        //an extra pointer 'ans' is maintained to keep track                                  of only lowest 'mid' value. 
            }
            else e=mid-1;       //if 'mid' value encountered gives greater result,                                    we simply discard all the values greater than mid. 
        }
        return ans;    
    }
};