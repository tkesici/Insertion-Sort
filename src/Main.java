/*
 * @author Tevfik Kesici
 * @since 18.06.2022
 */
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] input = {16,2,7,14,3,8,11,95,23,59,1,4,10,20,18};
        System.out.println(Arrays.toString(insertionSort(input)));
    }

    public static int[] insertionSort(int[] sequence) {
        int key = 0;
        int i = 0;
        for (int j = 1; j < sequence.length ; j++) {
            key = sequence[j]; // Operations run on the second element of the array
            i = j-1; // The previous element that we will compare the element with key
            while(i>=0 && sequence[i] > key) {
                sequence[i+1] = sequence[i]; // If any element before this element is greater than the key element, the elements are swapped
                i = i-1;
            }
            sequence[i+1] = key;
        }
        return sequence;
    }
}
