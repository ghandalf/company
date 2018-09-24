/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ghandalf.interviews.util;

import org.junit.After;
import org.junit.Before;
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
@SpringBootTest(classes = {OsType.class})
public class OsTypeTest {

    /**
     * Test of isUnix method, of class OsType.
     */
    @Test
    public void isUnix() {
        boolean expected = isTestable(OsType.isUnix());
        boolean actual = OsType.isUnix();
        assertEquals(expected, actual);
    }

    /**
     * Test of isSolaris method, of class OsType.
     */
    @Test
    public void isSolaris() {
        boolean expected = isTestable(OsType.isSolaris());
        boolean actual = OsType.isSolaris();
        assertEquals(expected, actual);
    }

    /**
     * Test of isWindows method, of class OsType.
     */
    @Test
    public void isWindows() {
        boolean expected = isTestable(OsType.isWindows());
        boolean actual = OsType.isWindows();
        assertEquals(expected, actual);
    }

    /**
     * Test of isMac method, of class OsType.
     */
    @Test
    public void isMac() {
        boolean expected = isTestable(OsType.isMac());
        boolean actual = OsType.isMac();
        assertEquals(expected, actual);
    }

    /**
     * Test of getRootCommand method, of class OsType.
     */
    @Test
    public void getRootCommand() {
        String[] expected;
        if (OsType.isWindows()) {
            expected = new String[] {"cmd.exe"};
        } else {
            expected = new String[] {"/bin/sh", "-c"};
        }

        String[] actual = OsType.getRootCommand();
        assertArrayEquals(expected, actual);
    }

    private boolean isTestable(boolean osType) {
        return osType;
    }
}
