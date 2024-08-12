package com.codekul.july26batch.ioc;

public class Vodafone implements Sim {

    @Override
    public void calling() {
        System.out.println("vodafone calling");

    }

    @Override
    public void msg() {
        System.out.println("vodafone msg");

    }
}
