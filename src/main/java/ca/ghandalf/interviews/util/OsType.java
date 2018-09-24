package ca.ghandalf.interviews.util;

/**
 *
 * @author ghandalf
 */
public class OsType {
    
    // No instanciation
    private OsType() {}
    
    private static final String TYPE = System.getProperty("os.name").toLowerCase();
    
    private String[] rootCommand;
    
    public static boolean isUnix() {
        return (TYPE.contains("nux") | TYPE.contains("nix") | TYPE.contains("aix"));
    }
    
    public static boolean isSolaris() {
        return TYPE.contains("sunos");
    }
    
    public static boolean isWindows() {
        return TYPE.contains("win");
    }
    
    public static boolean isMac() {
        return TYPE.contains("mac");
    }
    
    public static String[] getRootCommand() {
        if ( isUnix() | isSolaris() | isMac() ) {
            return new String[] {"/bin/sh", "-c"};
        } else {
            return new String[] {"cmd.exe"};
        }
    }
    
}
