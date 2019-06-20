package com.epam;

public class Magazine {

    public Magazine() {
        Goods goods = new Goods();
    }

    public void Magazine(int persons){
        Goods goods = new Goods();
        Client client = new Client();
        for (int i = 0; i <persons ; i++) {
            client.selectGoods();
            client.buyGoods();
        }
    }
}
