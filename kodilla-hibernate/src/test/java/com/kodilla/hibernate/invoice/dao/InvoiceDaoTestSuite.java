package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;

    @Test
    void testProductWorking(){

        Product product1 = new Product("Apple");
        Product product2 = new Product( "Orange");

        //System.out.println(product1.toString());

        productDao.save(product1);
        productDao.save(product2);

        for(Product product: productDao.findAll()){
            System.out.println(product.toString());
        }

        List<Product> productList = productDao.findByName("Apple");

        System.out.println(productList.toString());


        //productDao.deleteAll();
    }
}
