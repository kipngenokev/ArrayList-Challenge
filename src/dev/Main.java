package dev;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
         boolean flag = true;
        ArrayList<String> grocery = new ArrayList<>();
         while(flag) {
             printActions();
             switch(Integer.parseInt(scanner.nextLine())){
                 case 1 -> addItems(grocery);
                 case 2 -> removeItems(grocery);
                 default -> flag = false;
             }
             grocery.sort(Comparator.naturalOrder());
             System.out.println(grocery);
         }

    }
    private static void printActions() {
        String textBlock = """
                Available actions:
                                
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:""";

        System.out.print(textBlock + " ");
    }

    private static void addItems(ArrayList<String> grocery) {
        System.out.println("Add item(s) [Separate items by comma]:");
        String[] items = scanner.nextLine().split(",");
//        grocery.addAll(List.of(items));
         for (String i : items) {
             String trimmed = i.trim();
             if(grocery.indexOf(trimmed) < 0) {
                 grocery.add(trimmed);
             }
         }
    }

    private static void removeItems(ArrayList<String> grocery) {
        System.out.println("Enter item(s) for removal[separate items by a comma]:");
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
            grocery.remove(trimmed);
        }
    }
}
