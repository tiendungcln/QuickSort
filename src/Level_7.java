import java.util.Arrays;

public class Level_7 {
    // Quick Sort chuẩn bằng Lomuto Partition

    public static int partition(int[] arr, int low, int high){

        int pivot = arr[high];
        int pivotIndex = low;

        for (int i = low; i < high; i++){

            if (arr[i] < pivot){

                int temp = arr[i];
                arr[i] = arr[pivotIndex];
                arr[pivotIndex] = temp;
                pivotIndex++;

            }

        }

        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[high];
        arr[high] = temp;

        return pivotIndex;

    }

    public static void quickSort(int[] arr, int low, int high){

        // base case
        if (low >= high){
            return;
        }

        // Chia mảng quanh pivot và lấy vị trí cuối cùng của pivot ở Level_6
        int pivotIndex = partition(arr, low, high);

        // Đệ quy xử lý bên trái pivot
        quickSort(arr, low, pivotIndex - 1);
        // Đệ quy xử lý bên phải pivot
        quickSort(arr, pivotIndex + 1, high);

    }

    public static void main(String[] args){

        int[] arr = {10, 4, 2, 5, 8};

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
