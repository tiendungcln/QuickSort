import java.util.Arrays;

public class Level_5 {
    // Quick Sort bằng mảng phụ (Recursive Quick Sort)
    // Cho: [5, 2, 4, 10, 8]
    // Kq: [2, 4, 5, 8, 10]

    public static int[] quickSort(int[] arr){

        // base case
        if (arr.length <= 1){
            return arr;
        }

        int count = 0;
        int pivot = arr[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++){

            if (arr[i] < pivot){
                count++;
            }

        }

        int[] left = new int[count];
        int[] right = new int[(arr.length - 1) - count];
        int[] result = new int[left.length + 1 + right.length];

        int j = 0;
        int k = 0;
        int index = 0;

        for (int i = 0; i < arr.length - 1; i++){

            if (arr[i] < pivot){
                left[j] = arr[i];
                j++;
            } else {
                right[k] = arr[i];
                k++;
            }

        }

        // đệ quy
        int[] sortedLeft = quickSort(left);
        int[] sortedRight = quickSort(right);

        for (int i = 0; i < sortedLeft.length; i++){

            result[index] = sortedLeft[i];
            index++;

        }

        result[index] = pivot;
        index++;

        for (int i = 0; i < sortedRight.length; i++){

            result[index] = sortedRight[i];
            index++;

        }

        return result;

    }

    public static void main(String[] args){

        int[] arr = {5, 2, 4, 10, 8};
        System.out.println(Arrays.toString(quickSort(arr)));;

    }

}
