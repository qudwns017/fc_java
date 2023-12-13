package chapter02.ch20;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int total = 0;

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = i;
        }

        for (int num : arr) {
            total += num;
        }

        System.out.println(total);

        double[] dArr = new double[5];
        dArr[0] = 1.1;
        dArr[1] = 2.1;
        dArr[2] = 3.1;

        double mtotal = 1;

        for (double v : dArr) {
            mtotal *= v;
        }

        System.out.println(mtotal);
    }
}
