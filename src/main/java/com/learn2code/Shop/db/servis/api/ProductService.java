package com.learn2code.Shop.db.servis.api;

import com.learn2code.Shop.db.servis.api.Request.UpdateProductRequest;
import com.learn2code.Shop.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProduct();

    Product get(int id);
    Product delete (int id);
    Product update (int id, UpdateProductRequest request);

}
