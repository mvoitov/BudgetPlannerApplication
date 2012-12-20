/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.db;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maxim
 */
public class DataBaseTest {
    
    public DataBaseTest() {
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
     * Test of selectUsernameFromDbUserTable method, of class DataBase.
     */
    @Test
    public void testSelectUsernameFromDbUserTable() {
        System.out.println("selectUsernameFromDbUserTable");
        String username = "test1";
        boolean expResult = true;
        boolean result = DataBase.selectUsernameFromDbUserTable(username);
        assertEquals(expResult, result);
    }

    /**
     * Test of selectPasswordFromDbUserTable method, of class DataBase.
     */
    @Test
    public void testSelectPasswordFromDbUserTable() {
        System.out.println("selectPasswordFromDbUserTable");
        String password = "test1";
        boolean expResult = true;
        boolean result = DataBase.selectPasswordFromDbUserTable(password);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertRecordIntoDbUserTable method, of class DataBase.
     */
    @Test
    public void testInsertRecordIntoDbUserTable() {
        System.out.println("insertRecordIntoDbUserTable");
        String usernameValue = "";
        String passwordValue = "";
        DataBase.insertRecordIntoDbUserTable(usernameValue, passwordValue);
    }

    /**
     * Test of usernameIsNotAlreadyTaken method, of class DataBase.
     */
    @Test
    public void testUsernameIsNotAlreadyTaken() {
        System.out.println("usernameIsNotAlreadyTaken");
        String usernameValue = "test1";
        boolean expResult = true;
        boolean result = DataBase.usernameIsNotAlreadyTaken(usernameValue);
        assertEquals(expResult, result);
    }

    /**
     * Test of selectBudgetPlannersNames method, of class DataBase.
     */
    @Test
    public void testSelectBudgetPlannersNames() {
        System.out.println("selectBudgetPlannersNames");
        String username = "test";
        List expResult = new ArrayList();
        expResult.add("You don't have saved budgets");
        List result = DataBase.selectBudgetPlannersNames(username);
        assertEquals(expResult, result);
    }

    /**
     * Test of saveBudget method, of class DataBase.
     */
    @Test
    public void testSaveBudget() {
        System.out.println("saveBudget");
        String budgetName = "";
        boolean expResult = true;
        boolean result = DataBase.saveBudget(budgetName);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPageReadyBeforeResponse method, of class DataBase.
     */
    @Test
    public void testGetPageReadyBeforeResponse() {
        System.out.println("getPageReadyBeforeResponse");
        DataBase.getPageReadyBeforeResponse();
       
    }

    /**
     * Test of deleteBudget method, of class DataBase.
     */
    @Test
    public void testDeleteBudget() {
        System.out.println("deleteBudget");
        String budgetName = "";
        boolean expResult = false;
        boolean result = DataBase.deleteBudget(budgetName);
        assertEquals(expResult, result);
    }
}
