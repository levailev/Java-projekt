/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASSES;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author levai
 */
public class DB_INFOTest {
    
    public DB_INFOTest() {
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

    /**
     * Test of getConnection method, of class DB_INFO.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        Connection result = DB_INFO.getConnection();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
