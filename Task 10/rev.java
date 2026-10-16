

public class rev {
    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 45, 54};

        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swap(i, j, arr);
            i++;
            j--;
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
