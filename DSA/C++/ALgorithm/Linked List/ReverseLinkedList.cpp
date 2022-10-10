
class createLinkedList {
public:
    struct node {
        int data;
        node *next;
    };
    node *head, *tail;
    createLinkedList() {
        head = NULL;
        tail = NULL;
    }
    void addNode(int n) {
        node *tmp = new node;
        tmp->data = n;
        tmp->next = NULL;
        if (head == NULL) {
            head = tmp;
            tail = tmp;
        } else {
            tail->next = tmp;
            tail = tail->next;
        }
    }
    void display() {
        node *tmp = new node;
        tmp = head;
        while (tmp != NULL) {
            cout << tmp->data << " ";
            tmp = tmp->next;
        }
    }
    void reverse() {
        node *current, *prev, *next;
        current = head;
        prev = NULL;
        while (current != NULL) {
            next = current->next;
            current->next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    void   reverseRecursive(node *p) {
        if (p->next == NULL) {
            head = p;
            return;
        }
        reverseRecursive(p->next);
        node *q = p->next;
        q->next = p;
        p->next = NULL;
    }

    void deleteNode(int n) {
        node *tmp = new node;
        tmp = head;
        node *prev = new node;
        prev = NULL;
        while (tmp != NULL) {
            if (tmp->data == n) {
                if (tmp == head) {
                    head = head->next;
                    delete tmp;
                    return;
                }
                prev->next = tmp->next;
                delete tmp;
                return;
            }
            prev = tmp;
            tmp = tmp->next;
        }
    }
};
