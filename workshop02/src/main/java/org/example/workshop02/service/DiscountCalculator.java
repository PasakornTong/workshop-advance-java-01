package org.example.workshop02.service;

import org.example.workshop02.model.Basket;
import org.example.workshop02.model.Book;

import java.util.List;

public class DiscountCalculator {
    public static int get(Basket basket, int netPrice) {
        // Logic
        double discount = 0;
        List<Book> books = basket.getBooks();
        if(books.size() == 2) {
            discount = (double)netPrice - ( (double)netPrice * 5 / 100 );
        }
        if(books.size() == 3) {
            discount = (double)netPrice - ( (double)netPrice * 10 / 100 );
        }
        return (int)(discount * 100);
    }
}
