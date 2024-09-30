package E3;

import java.util.Scanner;

public class index_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int in = 0, c = 0;
        int max = 0;
        int g = 0;
        c = input.nextInt();
        for (int i = 1; i <= c; i++) {
            in = input.nextInt();
            g = gcd(in);
            if (max == 0 || g < max) {
                max = in;
            }
        }
        System.out.println("最大公约数为:" + max);
        input.close();
    }

    public static int gcd(int numbers) {
        // 最大公约数
        // 辗转相除法
        int a = numbers;
        int b = 0;
        int r = 0;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
