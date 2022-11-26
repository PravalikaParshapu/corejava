package com.specifierspractice;

public class Shop {

    public int shopId=1;
    private String shopName;
    protected String shopAdd;
    int phNo;
    public void method3() {

        System.out.println(shopId);
        System.out.println(shopName);
        System.out.println(shopAdd);
        System.out.println(phNo);
    }
    public static void main(String args[]){
        Shop m = new Shop();
        m.method3();
    }
}
