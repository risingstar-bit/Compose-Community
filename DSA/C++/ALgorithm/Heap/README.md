# Heap Creation 

<p align="center">
    <img src="https://image.slidesharecdn.com/heapsort-130409104315-phpapp02/85/heap-sort-9-320.jpg?cb=1365504239" width=600>
</p>

<br>

**Heap Creation from scratch** involves creation and deletion of heap nodes.

>A heap is a sophisticated tree-based data structure that is primarily used to build priority queues and sort data. They are full binary trees with the following characteristics:

1. Except for the leaf nodes, every level is full (nodes without children are called leaves).
2. There can be a maximum of two children per node.
Every child is to his parent's left since every node is as far to the left as it can be.

<br>

### Using Arrays

To prevent gaps in the array, heaps employ entire binary trees. A complete binary tree is one that has nodes at every level that are entirely full, with the exception of the leaf nodes, which can be empty. Each node in the tree has a maximum of two offspring. Heaps are created using the heap property, which contrasts the keys of the parent and child nodes.

### Heaps' benefits and drawbacks

Pros: 

>In order to release the memory used by the object, garbage collection is executed on the heap memory.
>As memory can be added or withdrawn in any sequence, heaps are versatile.
>Global access to variables is possible.
>Finding the lowest and highest number is useful.

Cons:

>Heaps require more time to execute than stacks.
>Since heap memory is used everywhere, memory management is more difficult.
>In general, heaps take longer to compute.

### Applications of Heap Data Structure


Heaps are efficient for finding the min or max element in an array and are useful in order statistics and selection algorithms. The time complexity of getting the minimum/maximum value from a heap is O(1)
O(1)
, (constant time complexity).

Priority queues are designed based on heap structures. It takes O(log(n))
O(log(n))
 time to insert (insert()) and delete (delete()) each element in the priority queue efficiently.

```
Heap-implemented priority queues are used in popular algorithms like:

Prim’s algorithm
Dijkstra’s algorithm
Heapsort algorithm
```

### How to build a max Heap

A max heap's elements adhere to their max heap property. This implies that the keys at the parent and both child nodes are always larger. To create a max heap, you must:

1. A new node should be created at the heap's root.
2. Assign a value to it.
3. Compare the parent node's value to that of the child node.
4. If the parent's value is lower than either child's, swap the nodes (to the left or right).
5. Continue until the root parent nodes contain the greatest element (then you can say that the heap property holds).

To remove/delete a root node in a Max Heap, you:

1. Delete the root node.
2. Move the last child node of the last level to root.
3. Compare the parent node with its children.
4. If the value of the parent is less than child nodes, swap them, and repeat until the heap property is satisfied.