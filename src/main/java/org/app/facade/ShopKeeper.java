package org.app.facade;

public class ShopKeeper {

    private Shop iphone;
    private Shop galaxyS;
    private Shop pixel;

    public ShopKeeper(){
        iphone = new Apple();
        galaxyS = new Samsung();
        pixel = new Google();
    }
    public void appleSale(){
        iphone.model();
        iphone.price();
    }
    public void samsungSale(){
        galaxyS.model();
        galaxyS.price();
    }
    public void googleSale(){
        pixel.model();
        pixel.price();
    }
}
