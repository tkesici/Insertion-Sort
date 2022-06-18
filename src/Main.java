/*
 * @author Tevfik Kesici
 * @since 18.06.2022
 */
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] input = {6,1,3,4,2,5};
        System.out.println("Result: " + Arrays.toString(insertionSortDescending(input)));
        // System.out.println("Search: " + search(input,30));
    }

    public static int[] insertionSort(int[] sequence) {
        int key = 0;
        int i = 0;
        int step = 1;
        for (int j = 1; j < sequence.length ; j++) {
            key = sequence[j]; // Operations run on the second element of the array
            i = j-1; // The previous element that we will compare the element with key
            while(i>=0 && sequence[i] > key) {
                sequence[i+1] = sequence[i]; // If any element before this element is greater than the key element, the elements are swapped
                i = i-1;
            }
            sequence[i+1] = key;
            System.out.println("Step " + step + ") Key: " + key + " Array: " + Arrays.toString(sequence));
            step++;
        }
        return sequence;
    }

    public static int[] insertionSortDescending(int[] sequence) {
        int key = 0;
        int i = 0;
        int step = 1;
        for (int j = 1; j < sequence.length ; j++) {
            key = sequence[j]; // Operations run on the second element of the array
            i = j-1; // The previous element that we will compare the element with key
            while(i>=0 && sequence[i] <= key) {
                sequence[i+1] = sequence[i]; // If any element before this element is greater than the key element, the elements are swapped
                i = i-1;
            }
            sequence[i+1] = key;
            System.out.println("Step " + step + ") Key: " + key + " Array: " + Arrays.toString(sequence));
            step++;
        }
        return sequence;
    }

    public static java.lang.Integer search(int[] sequence, int v) {
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] == v) {
                return v;
            }
        }
        return null;
    }
}
