package us.greatapps4you.cs.array;

import java.util.Arrays;

public class Array {

    private int count = 0;
    private int[] data = new int[10];

    public void insert(int element) {
        data[count] = element;
        count++;
    }

    public int size() {
        return count;
    }

    public int getAt(int index) {
        return data[index];
    }

    public void removeAt(int index) {
        moveAllElementsToIndex(index);
        count--;
    }

    private void moveAllElementsToIndex(int index) {
        for(int i = index; i < count; i++) {
            if(i + 1 < count) {
                data[i] = data[i + 1];
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
