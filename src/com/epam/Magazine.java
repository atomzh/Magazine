package com.epam;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Magazine {

    public Magazine(int persons) throws FileNotFoundException {
        Goods goods = new Goods();
        Client client = new Client();
        for (int i = 0; i <persons ; i++) {
            client.selectGoods();
        }
        try {
            goods.goodsReader();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
