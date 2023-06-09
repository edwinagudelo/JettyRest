/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package co.sbi.jettyrest.model;

import co.sbi.jettyrest.infrastructure.repositories.DbActions;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Edwin
 */
public class DbActionsTest {
    
    public DbActionsTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of getVersion method, of class DbActions.
     */
    @org.junit.jupiter.api.Test
    public void testGetVersion() {
        System.out.println("getVersion");
        String expResult = "";
        String result = DbActions.getVersion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
