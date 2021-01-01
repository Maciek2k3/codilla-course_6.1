package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.invoice.dao.ItemDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testToProductItemDetails {

    @Autowired
    ItemDao itemDao;

    @Test
   public void testProductItem() {
        //Given
        Product product = new Product("Bread");
        Item item = new Item(product, new BigDecimal(40), 2, new BigDecimal(45));

        //When
        itemDao.save(item);
        int id = item.getId();

        //Then
        assertNotEquals(0, id);
    }
}