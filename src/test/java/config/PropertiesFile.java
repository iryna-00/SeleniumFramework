package config;

import test.TestNG_Demo;

import java.io.*;
import java.util.Properties;

public class PropertiesFile {
    private static Properties prop = new Properties();
    private static String projectPath = System.getProperty("user.dir");

    public static void main(String[] args) {
        getProperties();
        setProperties();
        getProperties();

    }

    public static void getProperties(){
        try {

            InputStream input = new FileInputStream(projectPath + "/src/test/java/config/config.properties");
            prop.load(input);
            String browser = prop.getProperty("browser");
            System.out.println(browser);
            TestNG_Demo.browserName = browser;
        } catch (Exception exp) {
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }
    }

    public static void setProperties(){
        try {
            OutputStream write = new FileOutputStream(projectPath + "/src/test/java/config/config.properties");
            prop.setProperty("result", "Pass");
            prop.store(write, null);
        } catch (Exception exp) {
        System.out.println(exp.getCause());
        exp.printStackTrace();
        }
    }
}
