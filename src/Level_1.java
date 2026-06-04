public class Level_1 {
    // Tìm pivot cuối mảng.
    // [5,2,4,10,8]
    // pivot = 8

    public static void searchPivot(int[] arr){

            int pivot = arr[arr.length - 1];

            for (int i = 0; i < arr.length - 1; i++){

                if (arr[i] < pivot){

                    System.out.println(arr[i]);

                }

            }

    }

    public static void main(String[] args){

        int[] arr = {5, 2, 4, 10, 8};
        searchPivot(arr);

    }
}
