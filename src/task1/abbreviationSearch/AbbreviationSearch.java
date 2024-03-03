package task1.abbreviationSearch;

/*
 * class with a method for searching for abbreviations
 */

import task1.constant.IConstant;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbbreviationSearch {

    public static void abbreviationSearch(String str){
        Pattern pattern=Pattern.compile(IConstant.regex1);
        Matcher matcher= pattern.matcher(str);
        boolean isFind=false;
        while (matcher.find()){
            System.out.print(matcher.group()+", ");
            isFind=true;
        }
        if (!isFind){
            System.out.println("ничего не найдено");
        }
    }
}
