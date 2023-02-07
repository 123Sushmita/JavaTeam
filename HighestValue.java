public class HighestValue {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 8;
        if (a > b && a > c) {
            System.out.println("The highest value of a :" + a);
        } else if (b > a && b > c) {
            System.out.println("The highest value of b :" + b);
        } else {
            System.out.println("The highest value of c:" + c);
        }
    }
}

