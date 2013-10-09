package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList nameList = new ArrayList();

    public static void main(String[] args) throws IOException {
        askName();
    }

    public static void askName() throws IOException {                   // asks for name
        System.out.println("Please input a name to add to the list: ");
        Scanner scan = new Scanner(System.in);
        String tempName = scan.nextLine();
        System.out.println("You added the name, " + tempName);
        addName(tempName);              // adds name to array
        System.out.println("The current list of names is: " + nameList);  // prints array
        askName();
    }

    public static void addName(String tN) throws IOException {
        nameList.add(tN);
        fileWrite();
    }

    public static void fileWrite() throws IOException {
        File file = new File("/%appdata%/JavaFiles/Taylor.txt");
        if (!file.exists()) {
            file.mkdirs();
            file.createNewFile();
        }
        FileOutputStream fileOut = new FileOutputStream(file);
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
        objOut.writeObject(nameList);
        fileOut.close();
    }
}
