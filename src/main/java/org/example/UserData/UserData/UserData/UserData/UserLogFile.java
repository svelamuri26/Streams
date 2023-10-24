package org.example.UserData.UserData.UserData.UserData;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class UserLogFile {
    private static final Logger logger = Logger.getLogger(UserLogFile.class.getName());

    public static void main(String[] args) {

        try {
            FileHandler fileHandler = new FileHandler("user_interaction.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }



        log("User entered a name: Sai");
        log("User entered an age: 39");
        log("User entered an email: sai@example.com");
        log("User entered a phone number: 123-456-7890");
        log("User updated email to: sai.java@example.com");
        log("User updated phone number to: 987-654-3210");
        log("User deleted their information.");



        log("Program completed.");
    }

    private static void log(String message) {
        logger.info(message);
    }
}
