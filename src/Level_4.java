import java.util.Arrays;

public class Level_4 {
    // Ghép left + pivot + right thành result
    // left  = [5, 2, 1]
    // pivot = 8
    // right = [10]
    // kq: [5, 2, 1, 8, 10]

    public static void partitionByPivot(int[] arr){

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
            }else {
                right[k] = arr[i];
                k++;
            }

        }

        for (int i = 0; i < left.length; i++){

            result[index] = left[i];
            index++;

        }

        result[index] = pivot;
        index++;

        for (int i = 0; i < right.length; i++){

            result[index] = right[i];
            index++;

        }

        System.out.println(Arrays.toString(result));

    }

    public static void main(String[] args){

        int[] arr = {5, 2, 4, 10, 8};
        partitionByPivot(arr);

    }

}
