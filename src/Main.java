public class Main {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        // Prints contents of unsorted array.
        printContents(array);

        // Stores the largest number.
        int max;

        // Stores the index of the largest number.
        int maxIndex;

        // Sorts array using Selection Sort.
        for (int i = 0; i < array.length; i++) {
            // Resets the first index value as maximum.
            max = array[0];

            // Resets the index value of maximum number to be 0.
            maxIndex = 0;

            // Finds the maximum value in the array.
            for (int j = 1; j < array.length - i; j++) {
                if (max < array[j]) {
                    max = array[j];
                    maxIndex = j;
                }
            }
            swap(array, maxIndex, array.length - 1 - i);
        }

        // Prints contents of sorted array.
        printContents(array);
    }

    /**
     * Swaps values of two elements in an integer array.
     *
     * @param array Integer array.
     * @param i     Index of first element.
     * @param j     Index of second element.
     */
    public static void swap(int[] array, int i, int j) {
        // Checks if i and j are equal.
        if (i == j) {
            // No need to swap.
            return;
        }

        // Stores temp. values.
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Prints contents of an array.
     *
     * @param array Integer array.
     */
    public static void printContents(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
