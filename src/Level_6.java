public class Level_6 {
    // Lomuto Partition (Partition chuẩn của Quick Sort)
    // Cho: [10, 2, 4, 5, 8]
    // Pivot: 8
    // Sau partition: [2, 4, 5, 8, 10]
    // Không dùng: left[] right[] result[]
    // Mà swap trực tiếp trên mảng gốc.

    public static int partition(int[] arr){

        int pivot = arr[arr.length - 1];
        int pivotIndex = 0;

        for (int i = 0; i < arr.length - 1; i++){

            if (arr[i] < pivot){

                int temp = arr[i];
                arr[i] = arr[pivotIndex];
                arr[pivotIndex] = temp;
                pivotIndex++;

            }

        }

        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        // pivotIndex vẫn đang = 3 nên sau khi swap thì pivot đang ở index = 3

        return pivotIndex;

    }

    public static void main(String[] args){

        int[] arr = {10, 2, 4, 5, 8};
        System.out.println(partition(arr));;

    }

}
