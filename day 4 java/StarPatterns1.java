import java.util.*;
public class StarPatterns1 {
    public static void main(String[] args) {
        int n = 3;

        // Pattern 1
        System.out.println("Pattern 1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}