class MyLinkedList {

    int capacity = 10;
    int size = 0;
    int[] arr;

    public MyLinkedList() {
        arr = new int[capacity];
    }

    public int get(int index) {
        if (index >= size) {
            return -1;
        }
        return arr[index];
    }

    public void addAtHead(int val) {
        checkCapacity();
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = val;
        size++;
    }

    public void addAtTail(int val) {
        checkCapacity();
        arr[size++] = val;
    }

    public void addAtIndex(int index, int val) {
        checkCapacity();
        if (index > size) {
            return;
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = val;
        size++;

    }

    public void deleteAtIndex(int index) {
        if (index >= size) {
            return;
        }
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    private void checkCapacity() {
        if (size+1 >= capacity) {
            capacity *= capacity;
            arr = Arrays.copyOf(arr, capacity);
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */