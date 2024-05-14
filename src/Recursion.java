import java.util.*;

public class Recursion {
    public static void oddNumbers(int start) {
        if (start < 1) {
            throw new IllegalStateException();
        }

        if (start == 1) {
            System.out.print("1");
            System.out.println();
        }

        else if (start % 2 == 0) {
            oddNumbers(start - 1);
        }            

        else {
            System.out.print(start + ", ");
            oddNumbers(start - 2);
        }  
    }

    // public static int vowels(String check) {

    //     // base case?

    //     // else substring stuff
    // }

    public static int smallest(int[] smallest) {
        if (smallest.length < 1) {
            throw new IllegalArgumentException();
        }
        else {
            return 1;
        }
    }


    public static void main(String[] args) {
        oddNumbers(6);
        smallest(new int[] {});
    }
}