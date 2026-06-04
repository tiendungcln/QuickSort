import java.util.Arrays;

public class Level_3 {
    // Cho:
    // [5,2,10,1,8]
    // pivot = 8
    // Tạo 2 mảng:
    // left  = [5,2,1]
    // right = [10]

    public static void partitionByPivot(int[] arr){

        int pivot = arr[arr.length - 1];
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++){

            if (arr[i] < pivot){
                count++;
            }

        }

        int[] left = new int[count];
        int[] right = new int[(arr.length - 1) - count];

        int j = 0;
        int k = 0;

        for (int i = 0; i < arr.length - 1; i++){

            if (arr[i] < pivot){
                left[j] = arr[i];
                j++;
            } else {
                right[k] = arr[i];
                k++;
            }

        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

    }

    public static void main(String[] args){

        int[] arr = {5, 2, 4, 10, 8};
        partitionByPivot(arr);

    }
}
