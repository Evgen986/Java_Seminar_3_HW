package org.example.HW2;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product {
    private String nameProduct;
    private String country;
    private Double weight;
    private Integer price;
    private Integer grade;
}
