/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ghandalf.interviews.iweb;

import ca.ghandalf.interviews.util.OsNativeCommand;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author ghandalf
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FreeSpace.class)
public class FreeSpaceTest {
    
    @Autowired
    private FreeSpace instance;
    
    /**
     * Test of getFreeSpace method, of class FreeSpace.
     */
    @Test
    public void getFreeSpace() throws Exception {
        String expected = "G";
        
        String actual = instance.getFreeSpace();
        assertTrue(actual.contains(expected));
    }
}
