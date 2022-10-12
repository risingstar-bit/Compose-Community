bool detectLoop()
{
    Node *slowPointer = head,
         *fastPointer = head;

    while (slowPointer != NULL && fastPointer != NULL && fastPointer->next != NULL)
    {
        slowPointer = slowPointer->next;
        fastPointer = fastPointer->next->next;
        if (slowPointer == fastPointer)
            return 1;
    }

    return 0;
}

// Time complexity: O(n),
// Auxiliary Space: O(1),