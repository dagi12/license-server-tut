/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package license.server.tut;

import java.util.logging.Logger;

public class App {
    private static final String HELLO_WORLD = "Hello world.";
    private static final Logger LOGGER = Logger.getLogger("App");

    public static void main(String[] args) {
        LOGGER.info(new App().getGreeting());
    }

    String getGreeting() {
        return HELLO_WORLD;
    }
}
