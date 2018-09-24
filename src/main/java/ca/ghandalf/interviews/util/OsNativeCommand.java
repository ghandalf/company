/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ghandalf.interviews.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Component;

/**
 * Find out the free space on a file system
 *
 * @author ghandalf
 */
@Component
public class OsNativeCommand {

    // To avoid instanciation
    private OsNativeCommand() {}
    
    public static String execute(String[] commands) throws IOException, InterruptedException {
        String result = "";
        Process process = Runtime.getRuntime().exec(ArrayTool.concat(OsType.getRootCommand(), commands));

        BufferedReader buf = new BufferedReader(new InputStreamReader(process.getInputStream()));
        
        String line;
        while ((line = buf.readLine()) != null) {
            result += line;
        }
        return result;
    }

}
