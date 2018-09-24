package ca.ghandalf.interviews.util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author ghandalf
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ArrayTool.class)
public class ArrayToolTest {
    
    /**
     * Test of concat method, of class ArrayTool.
     */
    @Test
    public void concatString() {
        String[] rootCommands = {"r1", "r2"};
        String[] commands = {"command1", "command2"};
        String[] expected = {"r1", "r2", "command1", "command2"};
        
        String[] actual = ArrayTool.concat(rootCommands, commands);
        
        assertEquals(expected[expected.length -1], actual[actual.length - 1]);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void concatInteger() {
        Integer[] rootCommands = {9};
        Integer[] commands = {12};
        Integer[] expected = {9, 12};
    
        Integer[] actual = ArrayTool.concat(rootCommands, commands);
    
        assertEquals(expected[0], actual[0]);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void concatDouble() {
        Double[] root = {1.0, 2.0};
        Double[] commands = {12.0, 14.0};
        Double[] commands2 = {24.0, 26.0};
        
        Double[] expected = {1.0, 2.0, 12.0, 14.0, 24.0, 26.0};
        Double[] actual = ArrayTool.concat(root, commands, commands2);
        
        assertEquals(expected[1], actual[1]);
        Double expectedAtTwo = 12.0;
        // delta force the boxing to be executed before the comparaison
        assertEquals(expectedAtTwo, actual[2], 0.0);
    }
    
}
