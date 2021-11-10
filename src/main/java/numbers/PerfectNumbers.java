package numbers;

public class PerfectNumbers {

    public boolean isPerfectNumber(int number) {
        int accumulator = 0;

        for (int i = 1; i < (number/2)+1; i++) {
            if (number % i == 0) {
                accumulator += i;

            }
        }
        return (accumulator==number);
    }
}
