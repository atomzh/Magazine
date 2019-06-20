package com.epam;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Goods goods = new Goods();
        goods.addGoods();
        goods.showGoods();
        try {
            goods.goodsReader();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
