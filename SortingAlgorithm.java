// Abstract class
abstract class Sorting {
    // Abstract method to be implemented by subclasses
    abstract void sort(int[] arr);

    // Common method to display the array
    public void display(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

// Subclass 1: Bubble Sort
class BubbleSort extends Sorting {
    @Override
    void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble Sort Result:");
        display(arr);
    }
}

// Subclass 2: Selection Sort
class SelectionSort extends Sorting {
    @Override
    void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap arr[minIndex] and arr[i]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Selection Sort Result:");
        display(arr);
    }
}

// Subclass 3: Insertion Sort
class InsertionSort extends Sorting {
    @Override
    void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Insertion Sort Result:");
        display(arr);
    }
}

// Main class to test all sorts
public class SortingDemo {
    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};

        Sorting bubble = new BubbleSort();
        Sorting selection = new SelectionSort();
        Sorting insertion = new InsertionSort();

        // Each subclass sorts its own copy
        bubble.sort(data.clone());
        selection.sort(data.clone());
        insertion.sort(data.clone());
    }
}
