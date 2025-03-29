public class FizzBuzz {

    public static void calculate() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
                continue;
            }
            if (i % 3 != 0 && i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        FizzBuzz.calculate();
    }
}