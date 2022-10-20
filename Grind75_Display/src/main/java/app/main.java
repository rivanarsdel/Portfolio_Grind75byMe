package main.java.app;

import grind75implementations.Week1ImplLow;
import main.java.grind75implementations.Week1ImplHigh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//<><><><><>-----| Eventually to be made an API |-----<><><><><>\\
public class main {

    //<><><><><>-----| Number Test Cases |-----<><><><><>\\
    static int[] numList = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int[] numDynamo = new int[5];
    static int targetN = 11;
    static List<Integer> list1 = new ArrayList<>();
    static List<Integer> list2 = new ArrayList<>();
    //<><><><><>-----| Helper methods to instantiate things |-----<><><><><>\\
    public static void instNumLists() {
        for(int i = 0; i < 5; i++) {
            list1.add((int)(Math.random()*100));
            list2.add((int)(Math.random()*100));

        }
        int count = 0;
        for(int i : list1) {
            numDynamo[count] = i;
            count++;
        }
    }

    //<><><><><>-----| String Test Cases|-----<><><><><>\\
    static String testParen = "()[]{}";
    static String testParenBad = "(noclosure";
    static String palindrome = "abcdedcba";


//<><><><><>-----|                    |-----<><><><><>\\
//<><><><><>-----| The Big Red Button |-----<><><><><>\\
//<><><><><>-----|                    |-----<><><><><>\\

    public static void main(String[] args) {
        //<><><><><>-----| Instantiate variables |-----<><><><><>\\
        instNumLists();

        //<><><><><>-----| Verify Variables |-----<><><><><>\\
        System.out.println("First list of nums: " + list1.toString());
        System.out.println("First list of nums: " + list2.toString());

        //<><><><><>-----| Week 1 tests |-----<><><><><>\\
        Week1ImplLow w1low = new Week1ImplLow();
        Week1ImplHigh w1hig = new Week1ImplHigh();

        System.out.println(Arrays.toString(w1low.twoSum(targetN, numList)));
        System.out.println(w1hig.validParentheses(testParen));
        System.out.println(w1hig.validParentheses(testParenBad));
        System.out.println(w1hig.mergeTwoSortedLists(list1, list2));
        System.out.println(w1low.stockPurchaser(numDynamo));
        System.out.println(w1hig.validPalindrome(palindrome));
        System.out.println(w1hig.validPalindrome(testParen));
    }
}
