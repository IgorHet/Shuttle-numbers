public class ShuttleNumbers {
    public static void main(String[] args) {
        printLuckySpaceshipNumbers();
    }

    public static void printLuckySpaceshipNumbers() {
        int count = 0;
        int spaceshipNumber = 1;

        while (count < 100) {
            if (!isUnluckyNumber(spaceshipNumber)) {
                System.out.println("Spaceship " + spaceshipNumber);
                count++;
            }
            spaceshipNumber++;
        }
    }

    public static boolean isUnluckyNumber(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit == 4 || digit == 9) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}