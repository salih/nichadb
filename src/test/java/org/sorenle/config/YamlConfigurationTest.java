package org.sorenle.config;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
public class YamlConfigurationTest {

    @Test
    @Ignore
    public void testConfigurationFileMapping(){
        YamlConfigurationLoader yamlConfigurationLoader = new YamlConfigurationLoader();

        Config config = yamlConfigurationLoader.loadConfig();

        assertEquals(config.cluster_name,"nicha-local-test");

    }
}
