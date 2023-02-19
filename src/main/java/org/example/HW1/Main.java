package org.example.HW1;

import java.util.ArrayList;
import java.util.List;

/**
 * Дан массив записей:
 * - наименование товара;
 * - цена;
 * - сорт;
 * Найти: наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class Main {
    public static void main(String[] args) {
        Product pr1 = new Product("Хлеб Высший пробы", 200, 1);
        Product pr2 = new Product("Молоко", 300, 2);
        Product pr3 = new Product("Мясо не высший пробы", 1500, 3);
        Product pr4 = new Product("Мясо высший пробы", 1000, 1);
        Product pr5 = new Product("Сметана", 200, 1);
        Product pr6 = new Product("Сливки не Высший пробы", 1000, 2);

        List<Product> allProducts = List.of(pr1, pr2, pr3, pr4, pr5, pr6);
        List<Product> result = new ArrayList<>();
        for (Product prod : allProducts) {
            if ((prod.getGrade() == 1 || prod.getGrade() == 2)
                    && prod.getNameProduct().toLowerCase().contains("высший")) {
                if (result.isEmpty()) result.add(prod);
                else {
                    if (prod.getPrice() > result.get(0).getPrice()) {
                        result.clear();
                        result.add(prod);
                    } else if (prod.getPrice().equals(result.get(0).getPrice())) {
                        result.add(prod);
                    }
                }
            }
        }
        for (Product prod : result) {
            System.out.printf("\"%s\" стоит(ят) %d у.е.%n", prod.getNameProduct(), prod.getPrice());
        }
    }
}
