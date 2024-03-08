import java.util.ArrayList;
import java.util.List;

public class ShuttleNumbers {
    public static void main(String[] args) {
        List<Integer> shuttleNumbers = getShuttleNumbers();
        shuttleNumbers.forEach(System.out::println);
    }

    public static List<Integer> getShuttleNumbers() {
        List<Integer> shuttleNumbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (!isUnluckyNumber(i)) {
                shuttleNumbers.add(i);
            }
        }
        return shuttleNumbers;
    }

    private static boolean isUnluckyNumber(int number) {
        String numberString = String.valueOf(number);
        return numberString.contains("4") || numberString.contains("9");
    }
}