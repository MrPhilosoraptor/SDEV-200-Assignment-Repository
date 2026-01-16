
import java.util.Scanner;

public class array2DCompare {
    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length) {
            return false;
        }
        for (int i = 0; i < m1.length; i++) {
            if (m1[i].length != m2[i].length) {
                return false;
            }
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] m1;
        int[][] m2;
        String rows;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter m1 (a 3 by 3 matrix) row by row: ");
            rows = scan.nextLine();
            m1 = rows.lines()
                    .map(String::trim)
                    .map(line -> line.split(" "))
                    .map(arr -> {
                        int[] intArr = new int[arr.length];
                        for (int i = 0; i < arr.length; i++) {
                            intArr[i] = Integer.parseInt(arr[i]);
                        }
                        return intArr;
                    })
                    .toArray(int[][]::new);
            System.out.print("Enter m2 (a 3 by 3 matrix) row by row: ");
            rows = scan.nextLine();
            m2 = rows.lines()
                    .map(String::trim)
                    .map(line -> line.split(" "))
                    .map(arr -> {
                        int[] intArr = new int[arr.length];
                        for (int i = 0; i < arr.length; i++) {
                            intArr[i] = Integer.parseInt(arr[i]);
                        }
                        return intArr;
                    })
                    .toArray(int[][]::new);
        }
        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
    }
}
