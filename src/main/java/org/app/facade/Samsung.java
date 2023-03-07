package org.app.facade;

public class Samsung implements Shop {

    @Override
    public void model() {
        System.out.println("Galaxy S23+");
    }

    @Override
    public void price() {
        System.out.println("Still too much");
    }
}
