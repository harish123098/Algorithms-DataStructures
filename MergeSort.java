import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] elements = {10, 2, 3, 6, 8, 9, 1, 0};
        int length = elements.length;

        MergeSort ss = new MergeSort();
        ss.sort(elements, 0, length - 1);
        System.out.println(Arrays.toString(elements));

    }

    void sort(int[] arr, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            sort(arr, start, mid);          //sort first half
            sort(arr, mid + 1, end);  //sort second half
            merge(arr, start, mid, end);    //merge
        }

    }

    void merge(int[] arr, int start, int mid, int end) {

        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        //copy the sub halves in temp arrays
        System.arraycopy(arr, start, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = start;
        //merging
        while (i < n1 && j < n2) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //copy the remaining elements from both temp arrays
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
            ;
        }


    }


}
