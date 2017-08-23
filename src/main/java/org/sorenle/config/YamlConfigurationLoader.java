package org.sorenle.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Construct;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.constructor.CustomClassLoaderConstructor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class YamlConfigurationLoader implements ConfigurationLoader {
    private static final Logger logger = LogManager.getLogger(YamlConfigurationLoader.class);

    private final String yaml_name = "nicha.yaml";

    @Override
    public Config loadConfig() {
        Constructor constructor = new Constructor(Config.class);
        Yaml yaml = new Yaml(constructor);
        ClassLoader loader = YamlConfigurationLoader.class.getClassLoader();

        try (InputStream yamlFileStream = loader.getResourceAsStream(yaml_name)) {
        Config config = yaml.loadAs(yamlFileStream,Config.class);

            return config;
        } catch (FileNotFoundException e) {
            logger.fatal("Cannot locate " + yaml_name + " file. Configuration failed. There is a configuration file needed to start server.");
            logger.debug(e.getMessage());
            throw new ConfigException("Configuration file not found.", e.getCause());
        } catch (IOException e) {
            e.printStackTrace();
            throw new ConfigException("IOException occured.", e.getCause());
        }
    }


}
