package com.epam;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Client {
    Goods goods = new Goods();

    public void buyGoods(){

    }

    public void selectGoods(){
        goods.showGoods();
        System.out.println("Выше показано сколько всего товара на складе.\n" +
                "Какие товары выбрал покупатель?\n" +
                "Укажите товар и количество.");
        System.out.println("Количество вида товара у покупателя в корзине: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = Integer.parseInt(scanner.next());
        scanner.close();

        String clientGoods;
        int quantityGoods;
        String result;
        System.out.println("Напишите наименование товара и количество:");

        for (int i = 0; i < quantity ; i++) {
            result = scanner.next();
            StringTokenizer tokenizer = new StringTokenizer(result);
            clientGoods = tokenizer.nextToken();
            quantityGoods = Integer.parseInt(tokenizer.nextToken());
            goods.reductionOfGoods(clientGoods,quantityGoods);
        }

    }
}
