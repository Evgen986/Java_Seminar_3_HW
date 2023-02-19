package org.example.HW3;

import java.util.List;

/**
 * Сведения о книге состоят из:
 * - названия,
 * - фамилии автора,
 * - цены,
 * - года издания
 * - и количества страниц.
 * Найти названия книг, в которых:
 * - простое количество страниц,
 * - фамилия автора содержит «А»
 * - и год издания после 2010 г, включительно.
 */
public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Ночь в лесу", "Иванов", 500, 2010, 199);
        Book b2 = new Book("День в лесу", "Автов", 600, 2023, 467);
        Book b3 = new Book("Полдник в лесу", "Ольгин", 300, 2011, 41);
        Book b4 = new Book("Завтрак в лесу", "Иванов", 700, 1576, 200);
        Book b5 = new Book("Ужин в лесу", "Автов", 800, 2009, 881);

        List<Book> books = List.of(b1, b2, b3, b4, b5);
        for (Book book: books) {
            if(isPrimeNumber(book.getPages())
                    && book.getAuthor().toLowerCase().contains("а")
                    && book.getYear() >= 2010){
                System.out.printf("\"%s\", автор - %s, цена %d, год %d, страниц %d%n",
                        book.getNameBook(), book.getAuthor(), book.getPrice(), book.getYear(), book.getPages());
            }
        }
    }
    public static boolean isPrimeNumber(int num){
        if (num > 0){
            for (int i = 2; i < num/2; i++) {
                if (num % i == 0){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
}
