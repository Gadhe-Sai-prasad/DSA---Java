import java.util.*;
public class birthdayCakeCandle {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] candles = new int[n];
        for (int i = 0; i < n; i++) {
            candles[i] = scanner.nextInt();
        }
        System.out.println(birthdayCakeCandles(candles));
        scanner.close();
    }

    public static int birthdayCakeCandles(int[] candles) {
        int max = Arrays.stream(candles).max().orElse(0);
        int count = 0;
        for (int candle : candles) {
            if (candle == max) {
                count++;
            }
        }
        return count;
    }
}
