/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASSES;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ProductTest {
    
    public ProductTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testInsertProduct() {
        Product product = new Product(12, "alma", 49, "300", 13, "valami", "valami");
        Product.insertProduct(product);
        Product expected = getProductsByName("alma");
        assertNotNull(expected);
    }


    private Product getProductsByName(String PRODUCT){
        Product product = new Product();
        ArrayList<Product> list = product.productsList("  ");

        for(Product c : list){
            if(c.getName().equals(PRODUCT)){
                return c;
            }
        }
        return null;

    }
    
}
