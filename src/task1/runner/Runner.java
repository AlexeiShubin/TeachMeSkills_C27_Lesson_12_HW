package task1.runner;

import task1.abbreviationSearch.AbbreviationSearch;

import java.util.Scanner;

public class Runner {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str=scanner.nextLine();
        AbbreviationSearch.abbreviationSearch(str);
    }
}
