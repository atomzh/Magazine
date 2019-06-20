package com.epam;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Client {
    Goods goods = new Goods();

    public void selectGoods() throws FileNotFoundException {
        goods.addGoods();
        goods.showGoods();
        System.out.println("Выше показано сколько всего товара на складе и его стоимость.\n" +
                "Укажите количество вида товара у покупателя");
        Scanner scanner = new Scanner(System.in);
        int quantity = Integer.parseInt(scanner.next());

        String clientGoods;
        int quantityGoods;
        System.out.println("Напишите наименование товара и количество:");

        for (int i = 0; i < quantity ; i++) {
            clientGoods = scanner.next();
            quantityGoods = Integer.parseInt(scanner.next());
            goods.reductionOfGoods(clientGoods,quantityGoods);
        }
        System.out.println("Итого вышло: "+goods.getTotalCost());
        scanner.close();
    }
}
