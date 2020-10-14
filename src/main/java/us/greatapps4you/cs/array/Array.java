package us.greatapps4you.cs.array;

public class Array {

    private int count = 0;
    private int[] data = new int[3];

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
}
