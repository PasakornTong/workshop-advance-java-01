package org.example.workshop02.service;

import org.example.workshop02.model.Basket;
import org.example.workshop02.model.Book;

public class PriceCalculator {
    public static int get(Basket basket) {
        // Logic
        int price = 0;
        for (Book book : basket.getBooks()) {
            price += book.getPrice();
        }
        return price;
    }
}
