package Lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpDemo {
    public static void main(String[] args) {

    Pattern pattern = Pattern.compile("StepIt", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Welcome to StepIt!");

    boolean matchFound = matcher.find();

    if(matchFound)

    {
        System.out.println("Match found!");
    }
    else
    {
        System.out.println("Match not found!");
    }
    System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","aRun32"));
    System.out.println(Pattern.matches("[a-zA-Z0-9%]{6}","aRun%2"));
    System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","aRun32traq"));
    System.out.println(Pattern.matches("[789]\\d{9}","7123456789"));
    System.out.println(Pattern.matches("[7-9]*\\d{9}","79-123456789"));

}
}
