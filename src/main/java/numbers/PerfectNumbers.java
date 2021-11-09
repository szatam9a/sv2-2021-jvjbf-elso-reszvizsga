package numbers;

public class PerfectNumbers {

    public boolean isPerfectNumber(int number) {
        int accumulator = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                accumulator += i;
                if (accumulator > number) {
                    return false;
                }
            }
        }

        if (!(accumulator == number)) {
            return false;
        } else {
            return true;
        }
    }
}
