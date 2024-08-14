package dev.lpa;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        boolean flag =true;
        while(flag){
            printActions();
            switch(Integer.parseInt(scanner.nextLine())){
                default->flag=false;
            }
        }
    }
    public static void printActions(){
        String textBlock= """
                Available actions:
                                
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:""";
        System.out.println(textBlock + " ");
    }

}
