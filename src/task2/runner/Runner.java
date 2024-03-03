package task2.runner;

import task2.search.Search;

public class Runner {
    public static void main(String[] args) {

        String str="sgfdg dsffgd, gsgg klims@mail.com dgdfgrdv 1423-1512-51";
        System.out.println(str);
        Search.searchEmail(str);
        Search.searchDocNumber(str);
    }
}
