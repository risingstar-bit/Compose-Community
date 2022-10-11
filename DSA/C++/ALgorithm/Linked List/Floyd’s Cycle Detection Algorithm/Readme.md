Floyd’s cycle detection algorithm is a two pointer algorithm to **Find a Loop or Cycle** in a linked list. One of the pointers move twice as fast as the other one. The faster one is called the FAST pointer and the other one is called the SLOW pointer.

<br />

**How Does Floyd’s Cycle Detection Algorithm Works?**

While traversing the linked list, any one of the following things can occur <br />
    1. The Fast pointer may reach the end of the linked list implying that there is no loop in the linked list. <br />
    2. The Fast pointer again catches the slow pointer after some iterations implying existence of a loop exists in the linked list.
    
<br />

**Why Does Floyd’s Cycle Detection Algorithm Works?**

Let us assume the following things
> X = Distance between the head(starting) to the loop starting point.<br />
> Y = Distance between the starting point of the loop and the first meeting point of both the pointers.<br />
> C = The distance of the loop

So before meeting of both the pointers- <br />
The Slow pointer has traveled **X + Y + m * C distance**, where m is any positive number representing how many times the slow pointer has travelled through the loop.

The Fast pointer has traveled **X + Y + n * C distance**, where n is any positive number representing how many times the fast pointer has travelled through the loop.


Since the fast pointer is moving twice as fast as the slow pointer, we can say that the fast pointer has moved twice the distance to that of the slow pointer.

Hence,                   
 >    X + Y + m * C = 2 * (X + Y + n * C)<br />
 >    X + Y = (m * C) – (2 * n * C)

Since m and n, both are constants, hence we can say that **f * C – 2 * s * C = K * C**, K being some constant integer.

Thus,

>    X + Y = K * C       
>    X = K * C – Y

Now if we reset the slow pointer to the head of the linked list and move both the pointers by one unit at a time, we can conclude, from the above equation,  that both of them will meet again, after travelling X distance, at the starting point of the loop. It is so because after resetting the slow pointer and moving it through a distance of X, the fast pointer shall also move a distance of X (or K * C - Y) and hence the fast pointer will now reside at a distance of (K * C - Y) + Y(since the fast pointer has already travelled a distance of Y) = K * C <br /><br />
Hence the final position of the slow pointer will represent the starting of the loop.
