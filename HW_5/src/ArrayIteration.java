import java.util.Arrays;
import java.util.Iterator;

public class ArrayIteration implements Iterator<Integer> {
    private final Integer[] sortedArray;
    private int currentIndex;

    public ArrayIteration(int[] array) {

        Integer[] copy = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        Arrays.sort(copy, (a, b) -> b - a);
        this.sortedArray = copy;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < sortedArray.length;
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            return sortedArray[currentIndex++];
        } else {
            throw new java.util.NoSuchElementException();
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 42, 4, 32, 19, 98, 65};
        ArrayIteration iterator = new ArrayIteration(arr);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
