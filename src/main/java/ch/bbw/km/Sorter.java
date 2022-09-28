package ch.bbw.km;

/**
 * Class for sorting an array of integers and also for sorting an array of Person objects
 *
 * @author marco
 * @version 13.09.2022
 */
public class Sorter {
    public static void printArray(int[] numbers) {
        System.out.println("Sorted Array");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void bubbleSortForPeople(Person[] people) {
        // array length
        int n = people.length;
        // temporary variable to swap elements
        Person temp;
        // loop through all numbers
        for (int i = 0; i < n; i++) {
            // loop through numbers falling ahead
            for (int j = 1; j < (n - i); j++) {
                // compare elements and swap if greater than
                if (people[j - 1].compareTo(people[j]) > 0) {
                    //swap elements
                    temp = people[j - 1];
                    // assign greater element to the left
                    people[j - 1] = people[j];
                    // assign smaller element to the right
                    people[j] = temp;
                }
            }
        }

    }

    public static void insertionSort(int[] array) {
        // array length
        int n = array.length;
        // temporary variable to swap elements
        for (int j = 1; j < n; j++) {
            // assign element to be compared
            int key = array[j];
            // assign index of previous element
            int i = j - 1;
            // loop through all elements on the left of the compared element
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            // assign element to the right of the compared element
            array[i + 1] = key;
        }
    }

    public static void selectionSort(int[] array) {
        // array length
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index])
                    index = j;

            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array == null || array.length == 0)
            return;
        if (low >= high)
            return;
        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = array[middle];
        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        // recursively sort two sub parts
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }

    //Ziel Sortieralgorithmus erkennen können anhand des Sourcecodes

}

