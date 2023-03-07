package org.app.facade;

public class Google implements Shop {

    @Override
    public void model() {
        System.out.println("Pixel 7 Pro");
    }

    @Override
    public void price() {
        System.out.println("That's what I'm talking about");
    }
}
