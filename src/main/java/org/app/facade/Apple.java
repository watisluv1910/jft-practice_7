package org.app.facade;

public class Apple implements Shop {

    @Override
    public void model() {
        System.out.println("iPhone 14 Pro");
    }

    @Override
    public void price() {
        System.out.println("Too much");
    }
}
