package org.app.adapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Customer extends Bank implements CreditCard {

    public void setBankDetails(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("\nEnter the account holder name: ");
            String holderName = br.readLine();

            System.out.print("\nEnter the account number: ");
            long accNumber = Long.parseLong(br.readLine());

            System.out.print("\nEnter the bank name: ");
            String bankName = br.readLine();

            setAccHolderName(holderName);
            setAccNumber(accNumber);
            setBankName(bankName);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public String getCreditCard() {
        long accNumber = getAccNumber();
        String holderName = getAccHolderName(), bankName = getBankName();

        return "\nThe Account number " + accNumber + " of " + holderName + " in " + bankName +
                " bank is valid and authenticated for issuing the credit card.";
    }
}
