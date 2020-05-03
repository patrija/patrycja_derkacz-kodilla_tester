package com.kodilla.hibernate.invoice.repository;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceRepositoryTestSuite {
    @Autowired
    private InvoiceRepository invoiceRepository;

    @Test
    public void testInvoiceRepositorySave() {
        //Given
        Item item = new Item(new BigDecimal(100), 4, new BigDecimal(400));
        Item item2 = new Item(new BigDecimal(100), 2, new BigDecimal(200));
        //Product product = new Product("chair");
        // product.getItems().add(item);
        //product.getItems().add(item2);
        Invoice invoice = new Invoice("256/10-/019");
        invoice.getItems().add(item);
        invoice.getItems().add(item2);

        //When
        invoiceRepository.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceRepository.deleteById(id);

    }
}
