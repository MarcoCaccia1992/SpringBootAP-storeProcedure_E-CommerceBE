package com.example.microservice.service;


import com.example.microservice.entity.ProductsEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService{

    public String insertNewProduct(String name_product, Integer code_product, Integer fk_shop);

    public List<ProductsEntity> allProducts();

    public ProductsEntity findProductById(Integer id_product);

    public List<ProductsEntity> deleteAndOrderProductsByIDs(Integer id_product);

    public String updateAllProductsDataById(Integer id_product, String name_product, Integer code_product);

    public String updateProductsDataByIdCheckNULL(Integer id_product, String name_product, Integer code_product);

}
