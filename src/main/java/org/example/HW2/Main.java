package org.example.HW2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Сведения о товаре состоят из:
 * - наименования,
 * - страны-производителя,
 * - веса,
 * - цены,
 * - сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Main {
    public static void main(String[] args) {
        Product pr1 = new Product("Стол", "Россия", 15.5, 300, 1);
        Product pr2 = new Product("Стул", "Ктиай", 5.5, 200, 2);
        Product pr3 = new Product("Ручка", "Аргентина", 0.1, 5, 3);
        Product pr4 = new Product("Карандаш", "США", 0.1, 3, 2);
        Product pr5 = new Product("Лампа", "Индонезия", 3.5, 300, 1);
        Product pr6 = new Product("Стакан", "Россия", 0.5, 50, 2);
        Product pr7 = new Product("Телефон", "Япония", 0.7, 1000, 1);

        List <Product> allProduct = new ArrayList<>();
        allProduct.add(pr1);
        allProduct.add(pr2);
        allProduct.add(pr3);
        allProduct.add(pr4);
        allProduct.add(pr5);
        allProduct.add(pr6);
        allProduct.add(pr7);

        System.out.print("Введите сорт для поиска: ");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        sc.close();

        List <Product> setGradeMinPrise = findGrade(allProduct, grade);

        if(!setGradeMinPrise.isEmpty()) {
            for (Product prod : setGradeMinPrise) {
                System.out.printf("\"%s\" стоит %d у.е.%n", prod.getNameProduct(), prod.getPrice());
            }
        }else System.out.println("Товары не найдены!");
    }

    public static List <Product> findGrade(List <Product> products, int grade){
        List <Product> result = new ArrayList<>();
        for (Product prod: products) {
            if (prod.getGrade().equals(grade)){
                if (result.isEmpty()) result.add(prod);
                else{
                    if (result.get(0).getPrice() > prod.getPrice()){
                        result.clear();
                        result.add(prod);
                    } else if (result.get(0).getPrice().equals(prod.getPrice())) {
                        result.add(prod);
                    }
                }
            }
        }
        return result;
    }
}
