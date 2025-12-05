// triplet problem
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static boolean hasTriplet(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count occurrences
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            // If any number reaches count 3 → triplet exists
            if (map.get(num) == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (hasTriplet(arr)) {
            System.out.println("Triplet Found");
        } else {
            System.out.println("No Triplet");
        }
    }
}