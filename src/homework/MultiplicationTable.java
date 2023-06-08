
public class MultiplicationTable {
    public static void main(String[] args) {
        printMultiplicationTable(1, 1);
    }

    public static void printMultiplicationTable(int number, int multiplier) {
        if (multiplier <= 10) {
            int result = number * multiplier;
            System.out.println(number + "x" + multiplier + "=" + result);
            printMultiplicationTable(number, multiplier + 1);
        }
    }
}