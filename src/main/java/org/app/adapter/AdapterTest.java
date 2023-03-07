package org.app.adapter;

public class AdapterTest {

    public static void main(String[] args){
        CreditCard targetInterface = new Customer();
        targetInterface.setBankDetails();
        System.out.println(targetInterface.getCreditCard());
    }
}
