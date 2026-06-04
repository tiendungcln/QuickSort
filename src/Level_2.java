public class Level_2 {
    // Đếm bao nhiêu số nhỏ hơn pivot.
    // [5,2,4,1=,8]
    // pivot = 8
    // => 4 số

    public static void searchPivot(int[] arr){

        int pivot = arr[arr.length - 1];
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++){

            if (arr[i] < pivot){
                count++;
            }

        }

        System.out.println(count);

    }

    public static void main(String[] args){

        int[] arr = {5, 2, 4, 10, 8};
        searchPivot(arr);

    }

}
