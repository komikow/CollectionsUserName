package com.company;
//Приветствовать любого пользователя при вводе его имени через командную строку.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String userName = reader.readLine();
            System.out.println("Hello, "+userName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
