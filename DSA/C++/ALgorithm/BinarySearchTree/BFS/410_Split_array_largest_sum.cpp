class Solution {
public:

    bool ok(int x , vector<int> & a , int k) {
     for(auto t : a) {
       if(t > x) return 0;
     }
     int divs = 1;
     int sum = 0;
     int n = (int)a.size();
     for(int i = 0 ; i < n ; i++) {
         if(sum + a[i] > x) {
            sum = a[i];
            divs++;
         }
         else {
             sum += a[i];
         }
     }
     return divs <= k;
    }

    int splitArray(vector<int>& a, int k) {
        int l = -1;
        int r = 1;
        while(!ok(r,a,k)) r *= 2;
        while(r > l + 1) {
         int m = (l+r) >> 1;
         if(ok(m,a,k)) r = m;
         else l = m;
        }
        return r;
    }
};
