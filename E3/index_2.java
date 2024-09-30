package E3;

import java.util.Scanner;

public class index_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double in = 0;
        int index = 0;
        double array[] = new double[10];
        for (int i = 0; i < 10; i++) {
            in = input.nextDouble();
            array[i] = in;
        }
        index = indexOfSmallestElement(array);
        System.out.println(index);
        input.close();
    }

    public static int indexOfSmallestElement(double[] array) {
        int min_index = 0;
        double min_value = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min_value) {
                min_index = i;
                min_value = array[i];
            }
        }
        return min_index;
    }
}
