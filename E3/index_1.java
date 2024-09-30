package E3;
import java.util.*;
public class index_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double in = 0;
        double average = 0;
        double array[] = new double[10];
        for (int i = 0; i < 10; i++) {
            in = input.nextDouble();
            array[i] = in;
        }
        average = average(array);
        System.out.println(average);
        input.close();
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double i : array) {
            sum += i;
        }
        return sum / array.length;
    }
}
