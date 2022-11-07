package main.java.grind75implementations;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//<><><><><>-----| Higher level utilizes native Java libraries |-----<><><><><>\\
public class Grind75Imp implements grind75interfaces.Grind75 {


    @Override
    public int[] twoSum(int N, int[] numList) {
        return new int[0];
    }

    @Override
    public boolean validParentheses(String tesStr) {
        //<><><><><>-----| Create a stack, add things to the stack, check the stack |-----<><><><><>\\
        Stack<Character> chaSta = new Stack<>(); //Kind of like arraylists!
        for(int i = 0; i < tesStr.length(); i++) {
            char curCha = tesStr.charAt(i); //Get current character from string
            //Check if current char i is a paren
            if(curCha == '(' || curCha == '[' || curCha == '{') {
                chaSta.push(curCha);
            } else if (!chaSta.isEmpty()) {
                //Check if current character is close paren and has a paired open paren
                if(
                        curCha == ')' && chaSta.peek() == '(' ||
                                curCha == ']' && chaSta.peek() == '['  ||
                                curCha == '}' && chaSta.peek() == '{'
                ){
                    chaSta.pop();
                } else {
                    //If close
                    return false;
                }
            }
        }
        //If chaSta is empty, there are no parenthesis and the string is valid eg true
        return chaSta.isEmpty();
    }
    //<><><><><>-----| Given 2 sorted lists, merge them into one big sorted list |-----<><><><><>\\
    @Override
    public List<Integer> mergeTwoSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> listFinal = new ArrayList<>();
        listFinal.addAll(list1);
        listFinal.addAll(list2);
        Collections.sort(listFinal);

        return listFinal;
    }

    //<><><><><>-----| Given a list of ints representing stock price points, find the smallest starting N and largest ending N |-----<><><><><>\\
    @Override
    public int stockPurchaser(int[] numList) {

        List<Integer> list = new ArrayList<>();
        for(int i : numList) { list.add(i); }
        for(Integer i : list) {

        }

        return 0;
    }

    @Override
    public boolean validPalindrome(String palindrome) {
        StringBuilder strbld = new StringBuilder(palindrome);
        return strbld.reverse().toString().equals(palindrome);
    }

    @Override
    public double priceStringer(String priceString) {
//        Given string "$42.15, $83.44" and the like, find the mean price and sum total
//        Here we will employ regular expressions to extract the number from the string
        List<Double> locList = new ArrayList<>();
        String onePrice = "([0-9]+.)+([0-9]+)";
        Matcher matcher = Pattern.compile(onePrice).matcher(priceString);
        while (matcher.find( ))
        {
            locList.add(Double.parseDouble(matcher.group()));
        }
//       After parsing numbers from string we find sum and average
        double sumPrice = 0;
        int counter = 0;
        double avgPrice = 0;
        for(double i : locList) {
            sumPrice += i;
            counter++;
        }
        avgPrice = sumPrice / counter;
        System.out.println("Sum price: $" + sumPrice);
        System.out.println("Avg price: $" + avgPrice);
        return 0;
    }


    //<><><><><>-----| Find the first "bad" version |-----<><><><><>\\

    //<><><><><>-----| Max Subarray |-----<><><><><>\\


}
