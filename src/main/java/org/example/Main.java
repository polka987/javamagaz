package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] watchFirms = {"Casio", "Cartier", "Omega"};
        String[][] brands = {{watchFirms[0], "G-shock"}, {watchFirms[0], "Retro"}, {watchFirms[1], "Ronde de Cartier"}};
        Shop shop = new Shop(watchFirms, brands);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            shop.startOrder(scanner);
        }
        shop.displayOrders();
    }
}