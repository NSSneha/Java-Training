package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        //Data: what we are searching?
        //Source: where we are searching?

        Pattern pattern = Pattern.compile("core Java", Pattern.CASE_INSENSITIVE); //(data), no new keyword is used for creating obj
        Matcher matcher = pattern.matcher("We are learning Core Java"); //source
        boolean matchFound = matcher.find(); //if match found true else false
        System.out.println("Match found :" + matchFound);

        if(matchFound){
            System.out.println("Correct match found");
        }
        else{
            System.out.println("Match not found");
        }
    }
    // use flags in order to match irrespective of case sensitivity; flag is 'CASE_INSENSITIVE'
}
