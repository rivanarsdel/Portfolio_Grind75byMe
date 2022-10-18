package app;

import grind75implementations.Week1ImplLow;

import java.util.Arrays;

//<><><><><>-----| Eventually to be made an API |-----<><><><><>\\
public class main {

    //<><><><><>-----| Test Cases |-----<><><><><>\\
    static int[] numList = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int targetN = 11;

    public static void main(String[] args) {
        //<><><><><>-----| Low Level Solutions to Week 1 |-----<><><><><>\\
        Week1ImplLow w1low = new Week1ImplLow();

        System.out.println(Arrays.toString(w1low.twoSum(targetN, numList)));
    }
}
