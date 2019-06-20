package com.epam;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Goods {
    private static HashMap<String,String> goods = new HashMap<String, String>();
    private final static HashMap<String,Integer> goodsCost = new HashMap<String, Integer>();

    public Goods() {
    }

    public void addGoods() throws FileNotFoundException {
        String forBufferedReader;
        BufferedReader bf = new BufferedReader(new FileReader("goods"));
        try {
            while ((forBufferedReader = bf.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(forBufferedReader);
                String firstToken = tokenizer.nextToken();
                String secondToken = tokenizer.nextToken();
                int thirdToken = Integer.parseInt(tokenizer.nextToken());
                goods.put(firstToken,secondToken);
                goodsCost.put(firstToken,thirdToken);
            }
            bf.close();
        }
        catch (IOException e){
            System.err.println(e);
        }
    }
    public void showGoods(){
        System.out.println(goods);
        System.out.println(goodsCost);
        System.out.println(goods.keySet());
    }

    public int getTotalCost() {
        return totalCost;
    }

    private int totalCost;
    public void reductionOfGoods(String clientGoods,int quantityOfGoods){
        goods.put(clientGoods.toLowerCase(),String.valueOf(Integer.parseInt(goods.get(clientGoods))- quantityOfGoods));
        totalCost+=goodsCost.get(clientGoods)*quantityOfGoods;
    }

    public void goodsReader() throws IOException {
        String forBufferedReader = new String();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("goodss.txt"));
        for (String key: goods.keySet()) {
            bufferedWriter.write(key+" "+goods.get(key)+" "+goodsCost.get(key)+"\n");
        }
        bufferedWriter.close();
        }

    }

