/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package co.sbi.jettyrest.web.rest;

import co.sbi.jettyrest.infrastructure.repositories.DbActions;
import java.util.HashMap;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

/**
 *
 * @author Edwin
 */
public class MyControllerTest {
    
    private static MockedStatic<DbActions> dbUtil;
    
    public MyControllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        dbUtil = Mockito.mockStatic(DbActions.class);
        dbUtil.when(DbActions::getVersion).thenReturn("Version");
    }
    
    @AfterAll
    public static void tearDownClass() {
        dbUtil.close();
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getVersion method, of class MyController.
     */
    @Test
    public void testGetVersion() {
        System.out.println("MyController.getVersion");
        
        // Arrange
        HashMap<String, String> expResult = new HashMap<String,String>();
        expResult.put("version", "Version");
        
        // Act
        MyController instance = new MyController();
        HashMap<String, String> result = instance.getVersion();
        
        // Assert
        assertEquals(expResult, result);
    }
    
}
