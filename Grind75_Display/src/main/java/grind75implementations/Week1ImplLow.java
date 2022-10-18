package grind75implementations;

import grind75interfaces.Week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//<><><><><>-----| Low level functions use as little libraries as possible |-----<><><><><>\\
public class Week1ImplLow implements Week1 {

    //<><><><><>-----| Given an array of numbers and a target N, return the indexes of the two numbers that add to N |-----<><><><><>\\
    @Override
    public int[] twoSum(int N, int[] numList) {
        int[] result = new int[2];
        for(int i = 0; i < numList.length; i++) {
            for(int j = i+1; j < numList.length; j++) {
                if(numList[i] + numList[j] == N){
                    result[0] = i;
                    result[1] = j;
                    int resultSum = numList[i]+numList[j];
                    System.out.println("(VERIFICATION) Target: " + N + ", Num1: " + numList[i] + ", Num2: " + numList[j] + ", Sum: " + resultSum); //Debug
                    return result;
                }
            }
        }
        return null;
    }

    //<><><><><>-----| Given a string detect if ()[]{} are valid, ie have closure that is appropriate |-----<><><><><>\\
    @Override
    public boolean validParentheses(String s) {
        //<><><><><>-----| Immediate edge case that would be difficult: ([)] |-----<><><><><>\\

        return false;
    }

    @Override
    public List<Integer> mergeTwoSortedLists(List<Integer> list1, List<Integer> list2) {
        return null;
    }
}
