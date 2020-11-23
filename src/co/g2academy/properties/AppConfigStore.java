package co.g2academy.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class AppConfigStore {

    public static void main(String[] args) {

        Properties prop = new Properties();
        prop.setProperty("server", "localhost");
        prop.setProperty("port", "666");

        try {
            OutputStream out =
                    new FileOutputStream("config.properties");
            prop.store(out, null);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
