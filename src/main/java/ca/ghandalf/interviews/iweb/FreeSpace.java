/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ghandalf.interviews.iweb;

import ca.ghandalf.interviews.util.OsNativeCommand;
import java.io.IOException;
import org.springframework.stereotype.Component;

/**
 *
 * @author ghandalf
 */
@Component
public class FreeSpace {
    
    
    public String getFreeSpace() throws IOException, InterruptedException {
        return OsNativeCommand.execute(new String[]{"df -Ph . | tail -1 | awk '{print$4}'"});
    }
}
