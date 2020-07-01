package test.day9_testbase_properties_driverUtil;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readingFromProperties {
    @Test
    public void readingPropertiesFile() throws IOException {
        //this class object allow us to read from configurations property
        Properties properties = new Properties();
        //where did we store this file?, we need to show where file stores, we need path of file
        String path = "configuration.properties";

        //we need to open this configuration.properties file in java memory
        FileInputStream file = new FileInputStream(path);

        //we need to load the open file into the properties object
        properties.load(file);

        //we can read configurations.properties file using properties object
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));

        System.out.println("properties.getProperty(\"password\") = " + properties.getProperty("password"));
    }

@Test


        public void using_configuration_reader_utility(){
    String browser= ConfigurationReader.getProperty("browser");
    System.out.println("browser= " + browser);

    String username=ConfigurationReader.getProperty("username");
    System.out.println("username= "+ username);

    String password=ConfigurationReader.getProperty("password");
    System.out.println("password= "+ password);
        }

    }


