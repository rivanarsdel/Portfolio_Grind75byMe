package grind75implementations;

import java.util.List;

//<><><><><>-----| Low level functions use as little libraries as possible |-----<><><><><>\\
public class Week1ImplLow {

    //<><><><><>-----| Given an array of numbers and a target N, return the indexes of the two numbers that add to N |-----<><><><><>\

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

    //<><><><><>-----| Given a string detect if ()[]{} are valid, ie have closure that is appropriate |-----<><><><><>\

    public boolean validParentheses(String s) {
        //<><><><><>-----| Immediate edge case that would be difficult: ([)] |-----<><><><><>\\

        return false;
    }

    public List<Integer> mergeTwoSortedLists(List<Integer> list1, List<Integer> list2) {
        return null;
    }

    //<><><><><>-----| Given a list of ints representing stock price points, find the smallest starting N and largest ending N |-----<><><><><>\

    public int stockPurchaser(int[] numList) {
        int result = 0;
        for(int i = 0; i < numList.length; i++) {
            for(int j = i+1; j < numList.length; j++) {
                if(numList[j]-numList[i] > result) {
                    result = numList[j]-numList[i];
                }
            }
        }
        return result;
    }

//    Rewrite it you sussy baka
    public int stockStonker(int[] numList) {
        int result = 0;
        for(int i = 0; i < numList.length; i++) {
//            Iterate through numList
            for(int j = i+1; j < numList.length; j++) {
//                iterate through with second integer, testing each substraction *following* i, no 4th dimensional travel here
                if(numList[j]-numList[i] > result) {
//                    If j-i > result, stock is better == new best day to buy, eventually after testing all cases it finishes
                    result = numList[j]-numList[i];
                }
            }
        }
        return result;
    }

    public boolean validPalindrome(String palindrome) {
        //<><><><><>-----| Broken by edge case: ababa |-----<><><><><>\\
        for(int i = 0; i < palindrome.length()/2; i++) {
            if (palindrome.lastIndexOf(palindrome.charAt(i)) != palindrome.length()-1-i) {
                System.out.println(palindrome.charAt(i));
                System.out.println(palindrome.charAt(palindrome.length()-1-i));
                System.out.println(palindrome);
                return false;
            }
        }
        return true;
    }

    public void printOMatic(String newStr) {
        
    }
}
