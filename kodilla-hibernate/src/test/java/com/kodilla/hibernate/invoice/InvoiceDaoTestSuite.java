package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.invoice.dao.InvoiceDao;
import com.kodilla.hibernate.invoice.dao.ItemDao;
import com.kodilla.hibernate.invoice.dao.ProductDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {


    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("12345");
        Product product1 = new Product("product1");
        Product product2 = new Product("product2");

        Item item1 = new Item(product1, new BigDecimal(20), 21, new BigDecimal(3));
        Item item2 = new Item(product2, new BigDecimal(25), 22, new BigDecimal(5));

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        invoice.setItems(items);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        int size = invoice.getItems().size();

        Invoice invo = invoiceDao.findById(id);

        //Then
        Assert.assertEquals(id, invo.getId());
        Assert.assertEquals(2, size);
        Assert.assertEquals(size, invo.getItems().size());


        //CleanUp
        invoiceDao.deleteById(id);
    }
}
