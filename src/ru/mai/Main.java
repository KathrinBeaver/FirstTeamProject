package ru.mai;

import ru.mai.cleaners.BlanksCleaner;
import ru.mai.cleaners.UpperCaseCorrection;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();

        data = BlanksCleaner.cleanString(data);
        data = UpperCaseCorrection.correction(data);

        System.out.println(data);
    }
}
