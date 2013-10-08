package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        askName();
        List nameList = new ArrayList();                    // create arrayList
    }

    public static void askName() {                   // asks for name
        System.out.println("Please input a name to add to the list: ");
        Scanner scan = new Scanner(System.in);
        String tempName = scan.nextLine();
        System.out.println("You added the name, " + tempName);
        addName(tempName);              // adds name to array
        System.out.println("The current list of names is: " + nameList);  // prints array
    }

    public static void addName() {
        // this is a test of the emergency broadcasting system
    }

}
