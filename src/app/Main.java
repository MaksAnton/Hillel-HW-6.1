package app;

public class Main {

    public static void main(String[] args) {

        int[] numArr = {1, 2, 3, 4, 5, 6};
        int sumNumbers = 0;
        int count = 0;
        int spacerLen = 27;
        String spacer = ("-");

        for (int num : numArr) {
            count++;
            sumNumbers += num;
            System.out.printf("%d) Num is %d, sum is %d%n", count, count, sumNumbers);
        }

        for (int i = 0; i < spacerLen; i++)
            spacer += ("-");

        System.out.printf("%s%n Sum of numbers is %d", spacer, sumNumbers);
    }
}
