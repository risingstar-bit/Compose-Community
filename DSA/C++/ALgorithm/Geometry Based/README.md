# SKY LINE PROBLEM (Most asked interview problems)

<p align="center">
    <img src="https://assets.leetcode.com/uploads/2020/12/01/merged.jpg">
</p>

<br>

**Problem Description** involves geometry based problem but mostly you can do it using array.

> Problem Description: The Skyline Problem

A city's skyline is the outer contour of the silhouette formed by all the buildings in that city when viewed from a distance. Given the locations and heights of all the buildings, return the skyline formed by these buildings collectively.

The geometric information of each building is given in the array buildings where buildings[i] = [lefti, righti, heighti]:

lefti is the x coordinate of the left edge of the ith building.
righti is the x coordinate of the right edge of the ith building.
heighti is the height of the ith building.
You may assume all buildings are perfect rectangles grounded on an absolutely flat surface at height 0.

The skyline should be represented as a list of "key points" sorted by their x-coordinate in the form [[x1,y1],[x2,y2],...]. Each key point is the left endpoint of some horizontal segment in the skyline except the last point in the list, which always has a y-coordinate 0 and is used to mark the skyline's termination where the rightmost building ends. Any ground between the leftmost and rightmost buildings should be part of the skyline's contour.

Note: There must be no consecutive horizontal lines of equal height in the output skyline. For instance, [...,[2 3],[4 5],[7 5],[11 5],[12 7],...] is not acceptable; the three lines of height 5 should be merged into one in the final output as such: [...,[2 3],[4 5],[12 7],...]


<br>

### Solution

Input: [ [2,9,10], [3,7,15], [5,12,12], [15,20,10], [19,24,8]]
Output: [[2,10], [3,15], [7,12], [12,0], [15,10], [20,8], [24,0]]


Steps to consider:

1. We're at 0 firstly, our ongoing height is 0 for obvious reasons.
So at 2, the height is 10, great! Height at 2 is greater than our ongoing height 0. We change ongoing height to 10 (and also add 10 to our fallback heights list, I'll explain what it is).
2. At 3, we get another point with height 15. Now we choose between the ongoing height that was 10 and the new height that's 15. We choose the new height obviously (our ongoing height changed again, we'll add it to fallback list). Now the ongoing height is 15.
3. we arrive at 5 where the height is 12. Ongoing height 15 is still greater than the new point's height 12. So we keep the height as is for now (but 12 is still a height to consider, so add it to fallback list).
4. Then we arrive at 7, which is the end point for height 15, which means we need a fallback. Our ongoing height will no longer be 15. The fallback is chosen from other heights that we have right now. So we currently have 12 and 10, from green and blue buildings. 12 is the greatest, so 12 becomes our fallback ongoing height.
5. Then we arrive at 9, end point for height 10 from blue building. So, we cannot consider 10 as our fallback from now, since it just ended, so we'll remove it from our fallback height's list. The ongoing height is still 12.
6. Now we arrive at 12, this is our end point for the height 12, so we need a fallback height. Welp, there's none since height 10 and 15 ended already. So, take the fallback as 0 and our ongoing height now becomes 0.


### Code Works:


Since we must take into account every point, why don't we make an array called points that contains every point and its height? We pair the starting point and the height in this case, but we modify the height's sign from a plus sign to a minus sign so that the negative sign can help us decide whether the point is the starting point or the finishing point.
The ending point with a positive height will be inserted into the points array.

Our array is now prepared. We'll arrange it such that we cycle through each point in turn, exactly as we did before, but before we do that, we should note that we already know that our current height will always begin at 0.

Let's go over each point in the points array one by one.
So first determine whether the height at the present location is positive or negative:

If the result is negative, we know it's just a beginning point, so we can add it to our list of fallback heights in case the current height runs out and we need to find another height to fall back on.
If it's positive, we know that this height at this point won't be in our backup height list anymore because this point has already ended (positive height sign).
That's why its got remove from our fallback list of heights.


Now observe that we either added it to our fallback list or removed it from our fallback list "pq" depending on the sign of the current point. Which could imply that, at the moment, the height could either increase or decrease to fallback, but only if the current height is different from the maximum height in the fallback list. Since ongoing height is the maximum height, it will also be present in the fallback list.

We will change our ongoing height if, after adding the height at current point to our fallback list, the maximum height of the fallback list has increased in the case that the height at current point is greater than the ongoing height or decreased in the case that the height at current point is the end of the ongoing height and fallback is required.

1. As I previously stated, our answer receives a new entry anytime continuous height changes.
Therefore, we take both actions:

2. Set the continuing height as the 'pq' multiset's maximum height. Basically, the highest available fallback height.
Push currentPoint and the recently updated continuing height into the ans array (the new fallback height).




