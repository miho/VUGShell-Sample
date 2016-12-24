# VUGShell-Sample

## How to Run UGShell via Java

```java
package eu.mihosoft.ugshellsample;

import eu.mihosoft.ugshell.vugshell.Shell;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        String code = ""
                + "sum = 2 + 3\n"
                + "print(\"Hello from Java!\")\n"
                + "print(\"Result: \"..sum)";
        Shell.execute(new File("."), code).print().waitFor();
    }
}
```

## How to Build and Run VUGShell-Sample

### Requirements

- Java >= 1.8
- Internet connection (dependencies are downloaded automatically)
- IDE: [Gradle](http://www.gradle.org/) Plugin (not necessary for command line usage)

### IDE

Open the `VUGShell-Sample` [Gradle](http://www.gradle.org/) project in your favourite IDE (tested with NetBeans 8.2) and run it
by calling the `run` task.

### Command Line

Navigate to the [Gradle](http://www.gradle.org/) project (e.g., `VUGShell-Sample`) and enter the following command

#### Bash (Linux/OS X/Cygwin/other Unix-like shell)

    bash gradlew run
    
#### Windows (CMD)

    gradlew run
