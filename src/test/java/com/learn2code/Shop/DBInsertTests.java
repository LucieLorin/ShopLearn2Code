package com.learn2code.Shop;

import com.learn2code.Shop.domain.Customer;
import com.learn2code.Shop.domain.Merchant;
import com.learn2code.Shop.domain.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.lang.NonNull;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;

@RunWith(SpringRunner.class)
@SpringBootTest

public class DBInsertTests {

    private final String insertCustomer = "INSERT INTO customer(name, surname, email, address, age, phone_Number) values (?, ?, ?, ?, ?, ?)";
    private final String insertMerchant = "INSERT INTO merchant(name, email, address) values (?, ?, ?)";
    private final String insertProduct = "INSERT INTO product (merchant_id, name, description, price, available, created_At) values (?, ?, ?, ?, ?, ?)";


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void createCustomer() {
        Customer customer = new Customer();
        customer.setName("Pan");
        customer.setSurname("Grundza");
        customer.setEmail("grundza@fakemail.cz");
        customer.setAddress("xxxxxxx");
        customer.setAge(18);
        customer.setPhoneNumber("111222333");

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement psCustomer = connection.prepareStatement(insertCustomer);
                psCustomer.setString(1, customer.getName());
                psCustomer.setString(2, customer.getSurname());
                psCustomer.setString(3, customer.getEmail());
                psCustomer.setString(4, customer.getAddress());
                psCustomer.setInt(5, customer.getAge());
                psCustomer.setString(6, customer.getPhone_Number());
                return psCustomer;
            }
        });
    }

    @Test
    public void createMerchant() {
        Merchant merchant = new Merchant();
        merchant.setName("BigLebowski");
        merchant.setEmail("big@fake.cz");
        merchant.setAddress("HorniDolni 47");

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement psMerchant = connection.prepareStatement(insertMerchant);
                psMerchant.setString(1, merchant.getName());
                psMerchant.setString(2, merchant.getEmail());
                psMerchant.setString(3, merchant.getAddress());
                return psMerchant;
            }
        });
    }

    @Test
    public void createProduct() {
        Product product = new Product();
        product.setMerchant_Id(7);
        product.setName("Mys");
        product.setDescription("Krasna mys");
        product.setPrice(150.5);
        product.setAvailable(15);
        product.setCreated_At(Timestamp.from(Instant.now()));

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement psProduct = connection.prepareStatement(insertProduct);
                psProduct.setInt(1, product.getMerchant_Id());
                psProduct.setString(2, product.getName());
                psProduct.setString(3, product.getDescription());
                psProduct.setDouble(4, product.getPrice());
                psProduct.setInt(5, product.getAvailable());
                psProduct.setTimestamp(6, product.getCreated_At());
                return psProduct;
            }
        });


    }
}


