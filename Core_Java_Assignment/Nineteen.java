public class Nineteen {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int arrayAverage = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 20);
        }

        for (int num : arr) {
            arrayAverage += (num / arr.length);
        }

        System.out.println("Elements which are greater than the average of array are : ");
        for (int num : arr) {
            if (num > arrayAverage) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

    }
}
