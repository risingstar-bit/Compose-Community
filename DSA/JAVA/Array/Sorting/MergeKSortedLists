class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
        ListNode node=sort(lists,0,lists.length-1);
        return node;
    }
    public ListNode sort(ListNode [] arr,int l,int r){
        if(l==r)
            return arr[l];
        int mid=(l+r)/2;
        ListNode a=sort(arr,l,mid);
        ListNode b=sort(arr,mid+1,r);
        return merge(a,b);
    }
    
    public ListNode merge(ListNode a,ListNode b){
        ListNode head=new ListNode();
        ListNode n=head;
        while(a!=null && b!=null){
            if(a.val<b.val){
                n.next=a;
                n=n.next;
                a=a.next;
            }else{
                n.next=b;
                n=n.next;
                b=b.next;
            }
        }
        while(a!=null){
            n.next=a;
            a=a.next;
            n=n.next;
        }
        while(b!=null){
            n.next=b;
            b=b.next;
            n=n.next;
        }
        return head.next;
    }
}
