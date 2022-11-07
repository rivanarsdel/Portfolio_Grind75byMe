package main.java.grind75implementations;

import main.java.grind75interfaces.RegEx;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExImpl implements RegEx {
    @Override
    public double findPrices(String priceString) {
        List<Double> locList = new ArrayList<>();
        String regEx = "([0-9]+.[0-9]+)";
        Matcher matcher = Pattern.compile(regEx).matcher(priceString);
        while(matcher.find()){
            locList.add(Double.parseDouble(matcher.group()));
        }
        for(Double i : locList){
            System.out.println("Price: $" + i);
        }
        return 0;
    }

    public double findPrices2(String priceString) {
//        List of doubles we will extract from priceString
        List<Double> locList = new ArrayList<>();
//        Regular expression to select digits which repeat separated by decimal
//        If a number is at the end of a sentence this *should* still work but I think it may break it.
        String regEx = "([0-9]+.[0-9]+)";
        Matcher matcher = Pattern.compile(regEx).matcher(priceString);
//        For each match adds entity to double list
        while(matcher.find()){
            locList.add(Double.parseDouble(matcher.group()));
        }
        for(Double i : locList) {
            System.out.println(i);
        }
        return 0;
    }

    public double finrPrice3(String priceString) {
//        Another rep! let's go!
        List<Double> locList = new ArrayList<>();
        String regEx = "([0-9]+.[0-9]+)";
        Matcher matcher = Pattern.compile(regEx).matcher(priceString);
        while(matcher.find()){
            locList.add(Double.parseDouble(matcher.group()));
        }
        return 0;
    }
}
