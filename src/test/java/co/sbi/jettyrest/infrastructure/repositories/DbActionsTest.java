/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package co.sbi.jettyrest.infrastructure.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import co.sbi.jettyrest.infrastructure.repositories.DbActions;

/**
 *
 * @author Edwin
 */
public class DbActionsTest {
    
    private static MockedStatic<DbActions> dbUtil;
    
    public DbActionsTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
        dbUtil = Mockito.mockStatic(DbActions.class);
        dbUtil.when(DbActions::getVersion).thenReturn("Version");
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
        dbUtil.close();
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
        final String expResult = "Version";
        String result = DbActions.getVersion();
        assertEquals(expResult, result);
    }
    
}
