package NopCommarceBook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Dell on 21/04/2017.
 */
public class LoadProp extends BasePage {

    static Properties prop;
    static FileInputStream input;

    public String getProperty(String key) {
        prop = new Properties();
        try {
            input = new FileInputStream("C:\\Users\\Dell\\IdeaProjects\\NopCommarceBook\\src\\test\\Resources\\config.properties");
            prop.load(input);
            input.close();
        }
        catch (IOException e) {
            e.getStackTrace();
        }
        return prop.getProperty(key);
    }

//    public static void main(String[] args) {
//        System.out.println(getProperty(""));
//    }
}