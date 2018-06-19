package com.jbabineau.sfgthymeleafcourse.services;

import com.jbabineau.sfgthymeleafcourse.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}
