package org.app.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadeTest {

    public static void main(String[] args) throws NumberFormatException, IOException {
        int choice;

        do {
            System.out.print("""
                    \n========= Mobile Shop ============
                    1. Apple iPhone.
                    2. Samsung Galaxy S.
                    3. Google Pixel.
                    4. Exit.
                    
                    Enter your choice:
                    """);

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            choice =Integer.parseInt(br.readLine());
            ShopKeeper sk=new ShopKeeper();

            switch (choice) {
                case 1 -> sk.appleSale();
                case 2 -> sk.samsungSale();
                case 3 -> sk.googleSale();
                default -> System.out.println("Going out from the shop...");
            }

        } while (choice != 4);
    }
}
