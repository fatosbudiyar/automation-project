package PropertiesProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader1 {

  // String url = ConfigLoader.getMyValue("a key in here") ; 
  // driver.get(url) ; 

  
    public static String getMyValue(String key) {
      

      Properties prop = new Properties();
    
      try {
        FileInputStream fis = new FileInputStream("config.test");
        prop.load(fis);
      
      
      } catch (IOException e) {
        
        e.printStackTrace();
      }
      //System.out.println( prop.getProperty("fairfax") );
      String value = prop.getProperty(key) ; 

      return value ; 
    
    }
}