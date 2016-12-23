package eu.mihosoft.ugshellsample;

import eu.mihosoft.ugshell.vugshell.Shell;
import java.io.File;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String code = ""
                + "sum = 2 + 3\n"
                + "print(\"Hello from Java!\")\n"
                + "print(\"Result: \"..sum)";
        Shell.execute(new File("."), code).print().waitFor();
    }
}
