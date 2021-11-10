package com.live_project_frontend.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String readProperty(String property) {
        Properties prop = null;
        try {
            FileInputStream fileInput = new FileInputStream("src/test/resources/config.properties");
            prop = new Properties();
            prop.load(fileInput);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop.getProperty(property);
    }
}
