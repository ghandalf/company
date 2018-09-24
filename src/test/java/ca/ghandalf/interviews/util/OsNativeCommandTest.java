/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ghandalf.interviews.util;

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
@SpringBootTest(classes = { OsNativeCommand.class })
public class OsNativeCommandTest {
    
    
    /**
     * Test of execute method, of class OsNativeCommand.
     */
    @Test
    public void execute() throws Exception {
        String[] commands = { "df -Ph . | tail -1 | awk '{print $4}'" };

        String expected = "G";
        String actual = OsNativeCommand.execute(commands);
        
        assertTrue(actual.contains(expected));
    }

}
