class Solution {
    public int maxArea(int[] height) {
         int i=0,area=0,maxarea=-1;
    int j=height.length-1;

    while(i!=j){
        if(height[i]<height[j])
        {
            area=height[i]*(j-i);
            i++;
           
        }
        else{
            area=height[j]*(j-i);
            j--;
        }
        if(area>maxarea){
                maxarea=area;
            }
    }
    return maxarea;
    }
}