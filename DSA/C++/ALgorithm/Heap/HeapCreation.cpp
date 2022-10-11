class Heap {
public:
    Heap(int size) {
        this->size = size;
        this->heap = new int[size];
        this->heap[0] = 0;
    }
    ~Heap() {
        delete[] this->heap;
    }
    void insert(int value) {
        if (this->heap[0] == this->size) {
            return;
        }
        this->heap[0]++;
        this->heap[this->heap[0]] = value;
        int i = this->heap[0];
        while (i > 1 && this->heap[i] > this->heap[i / 2]) {
            int temp = this->heap[i];
            this->heap[i] = this->heap[i / 2];
            this->heap[i / 2] = temp;
            i /= 2;
        }
    }
    int remove() {
        if (this->heap[0] == 0) {
            return -1;
        }
        int value = this->heap[1];
        this->heap[1] = this->heap[this->heap[0]];
        this->heap[0]--;
        int i = 1;
        while (i * 2 <= this->heap[0]) {
            int j = i * 2;
            if (j < this->heap[0] && this->heap[j] < this->heap[j + 1]) {
                j++;
            }
            if (this->heap[i] > this->heap[j]) {
                break;
            }
            int temp = this->heap[i];
            this->heap[i] = this->heap[j];
            this->heap[j] = temp;
            i = j;
        }
        return value;
    }
private:
    int size;
    int *heap;
};
