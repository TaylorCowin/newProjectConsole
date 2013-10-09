package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList nameList = new ArrayList();

    public static void main(String[] args) {
        askName();
    }

    public static void askName() {                   // asks for name
        System.out.println("Please input a name to add to the list: ");
        Scanner scan = new Scanner(System.in);
        String tempName = scan.nextLine();
        System.out.println("You added the name, " + tempName);
        addName(tempName);              // adds name to array
        System.out.println("The current list of names is: " + nameList);  // prints array
        askName();
    }

    public static void addName(String tN) {
        nameList.add(tN);
        fileWrite(nameList);
    }

    public static void fileWrite() {
        File file = new File("/%appdata%/JavaProg/TestFile/nameList.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(nameList);
        bw.close();
    }
}
}
