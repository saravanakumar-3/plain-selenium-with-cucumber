package com.automation.utils;

import com.automation.steps.BaseStefDef;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
  private PropertiesUtil() {}

  public static Properties getProperties() {
    System.out.println("Loading Properties");
    InputStream resource =
        BaseStefDef.class.getClassLoader().getResourceAsStream("config.properties");
    Properties properties = new Properties();
    try {
      properties.load(resource);
      properties.forEach((o, o2) -> System.out.println(o + "=" + o2));
    } catch (IOException e) {
      System.out.println("Error: Not able to load properties file");
      throw new RuntimeException(e);
    }
    return properties;
  }
}
