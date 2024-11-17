package org.config;

import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
    private static final Properties properties = new Properties();

    /*
      	static { ... }: Статический блок выполняется один раз при загрузке класса в память.
      	Здесь используется для инициализации конфигурации.
     */
    static {
        try (var input = ConfigLoader.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                throw new RuntimeException("Конфигурационный файл не найден, проверьте его наличие" +
                        " по пути src/main/resources");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка загрузки конфигурации, возможно файл поврежден :(", e);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }

    public static String get(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }
}
