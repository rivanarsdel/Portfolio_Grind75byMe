package main.java.grind75implementations;

import grind75interfaces.Week1;

import java.util.*;

//<><><><><>-----| Higher level utilizes native Java libraries |-----<><><><><>\\
public class Week1ImplHigh implements Week1 {


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

        return 0;
    }
}
