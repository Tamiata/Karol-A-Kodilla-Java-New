package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testProductWorking() {

        //Given
        Product product1 = new Product("Apple");
        Product product2 = new Product("Orange");
        Product product3 = new Product("Onion");

        Item item1 = new Item(product1, new BigDecimal(20), 10);
        Item item2 = new Item(product2, new BigDecimal(10), 20);
        Item item3 = new Item(product3, new BigDecimal(5),5);

        item1.setProductName(product1.getName());
        item2.setProductName(product2.getName());
        item3.setProductName(product3.getName());

        //When
        Invoice invoice = new Invoice();

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);

        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);

        invoiceDao.save(invoice);



        int invoiceId = invoice.getId();
        Invoice invoiceFromDB = invoiceDao.findById(invoiceId);

        List<Item> listOfItems = itemDao.findAll();

        List<Product> listOfProducts = productDao.findAll();

        //Then
        assertNotEquals(0, invoiceId);
        assertEquals(3, invoiceFromDB.getItems().size());
        assertEquals(3, listOfItems.size());
        assertEquals(3, listOfProducts.size());



        //Cleanup
        itemDao.deleteAll();
        productDao.deleteAll();
        invoiceDao.deleteAll();
    }
}
