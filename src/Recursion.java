import java.util.*;

/*
 * Kevin Nguyen
 * 05/16/2024
 *
 * The main program holds 8 different recursion methods: list all odd numbers,
 * print number of vowels, find the smallest integer, check for duplicates, print a
 * sentence character by character, list integers and indicate which are divisible by 3
 * and/or 5, find the longest word, and print the nth lucas number.
 */
public class Recursion {

    /**
     * Lists all odd numbers from a given integer to zero
     * @param start is the integer it starts from
     */
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

    /**
     * Counts the vowels in a string
     * @param check is the string we are checking for vowels
     * @return the number of vowels in the string check
     */
     public static int vowels(String check) {
         if (check.isEmpty()) {
             return 0;
         }

         else {
             char character = Character.toLowerCase(check.charAt(0));

             if (character == 'a' || character == 'e' || character == 'i' ||
                     character == 'o' || character == 'u') {
                 return 1 + vowels(check.substring(1));
             }
             else {
                 return vowels(check.substring(1));
             }
         }
     }

    /**
     * Finds the smallest integer of an array
     * @param smallest is the integer array we are finding the smallest integer
     * @return the smallest integer of the array
     */
     public static int smallest(int[] smallest) {
        if (smallest.length < 1) {
            throw new IllegalArgumentException();
        }

        else {
             return smallHelper(smallest, 0, smallest[0]);
        }
    }

    private static int smallHelper(int[] array, int index, int current) {
        if (index == array.length) {
            return current;
        }

        if (array[index] < current) {
            current = array[index];
        }

        return smallHelper(array, index + 1, current);
    }


    /**
     * Checks for a case in the string where there is a duplicate of characters in it
     * @param observe is the string we look at
     * @return true if there is a duplicate and false if not
     */
    public static boolean duplicateNeighbors(String observe) {
        if (observe.isEmpty() || observe.length() == 1) {
            return false;
        }

        else {
            char char1 = Character.toLowerCase(observe.charAt(0));
            char char2 = Character.toLowerCase(observe.charAt(1));

            if (char1 == char2) {
                return true;
            }

            else {
                return duplicateNeighbors(observe.substring(1));
            }
        }
    }

    /**
     * Prints the sentence character by character, each with their own line
     * @param sentence is split character by character
     */
   public static void printChars(String sentence) {
       if (sentence.length() == 0) {
           System.out.println("");
       }

       else { 
           System.out.println(sentence.substring(0, 1));
           printChars(sentence.substring(1, sentence.length()));
       }
   }

    /**
     * Decrementing from the value to 1, it will print the number and hip if the number
     * divisible by 3, hop for 5, and hip hop if both. Otherwise, it will only list the number
     * @param value it starts from
     */
    public static void hipHop(int value) {
        if (value == 1) {
            System.out.println("1");
        }

        else {
            if (value % 3 == 0 && value % 5 == 0) {
                System.out.println(value + " - hip hop");
            }
            else if (value % 3 == 0) {
                System.out.println(value + " - hip");
            }
            else if (value % 5 == 0) {
                System.out.println(value + " - hop");
            }
            else {
                System.out.println(value);
            }
            hipHop(value - 1);
        }
    }

    /**
     * Finds the longest word in the array
     * @param words is the String array we are using
     * @return the longest word of the array
     */
     public static String longestWord(String[] words) {
        if (words.length == 0) {
            return null;
        }

        else {
            return longestHelper(words, 0, words[0]);
        }
    }

    private static String longestHelper(String[] words, int index, String current) {
        if (index == words.length) {
            return current;
        }

        if (current.length() < words[index].length()) {
            current = words[index];
        }

        return longestHelper(words, index + 1, current);
    }

    /**
     * Finds the nth Lucas Number
     * @param n is the Lucas Number
     * @return the nth Lucas Number
     */
    public static int lucasNumber(int n) {
        if (n == 0) {
            return 2;
        }

        if (n == 1) {
            return 1;
        }

        else {
            return lucasNumber(n-1) + lucasNumber(n-2);
        }
    }

    public static void main(String[] args) {
        oddNumbers(6);
        System.out.println();
        System.out.println(vowels("are we there yet?"));
        System.out.println();
        System.out.println(smallest(new int[] {1}));
        System.out.println();
        System.out.println(duplicateNeighbors("abaa")); // working but not returning correct
        System.out.println();
        printChars("sentence");
        hipHop(6);
        System.out.println();
        System.out.println(longestWord(new String[] {"and", "as", "abba", "are"}));
        System.out.println();
        System.out.println(lucasNumber(3));
    }
}