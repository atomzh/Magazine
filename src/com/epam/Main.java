package com.epam;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Сколько людей стоит в очереди?");
        Scanner scanner = new Scanner(System.in);
        Magazine magazine = new Magazine(Integer.parseInt(scanner.next()));
    }
}
