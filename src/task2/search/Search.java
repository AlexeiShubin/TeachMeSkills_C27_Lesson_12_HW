package task2.search;

/*
 * class with a search method for mail and document numbers
 */

import task2.constant.IConstant;

import java.util.regex.Matcher;

public class Search {

    public static void searchEmail(String str){
        Matcher matcherEmail= IConstant.email.matcher(str);
        boolean isEmail=false;
        while(matcherEmail.find()){
            System.out.println("email: "+matcherEmail.group());
            isEmail=true;
        }
        if (!isEmail){
            System.out.println("Email отсутствует");
        }
    }

    public static void searchDocNumber(String str){
        Matcher matcherDocNumber=IConstant.docNumber.matcher(str);
        boolean isPhone=false;
        while(matcherDocNumber.find()){
            System.out.println("doc number: "+matcherDocNumber.find());
        }
        if (!isPhone){
            System.out.println("номер документа отсутствует");
        }
    }
}
