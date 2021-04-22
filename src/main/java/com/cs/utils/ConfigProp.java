package com.cs.utils;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.Properties;

public class ConfigProp {

    private static ConfigProp instance = null;
    public static Properties data = new Properties();

    private ConfigProp() {
        File files = new File("src/main/resources"); // TODO: insert full path here
        File[] str = files.listFiles();
        Properties props = new Properties();
        FileInputStream in = null;

        try {
            assert str != null;
            for (File s : str) {
                in = new FileInputStream(s);
                props.load(in);
                for (Map.Entry<Object, Object> entry : props.entrySet())
                    data.put(entry.getKey(), entry.getValue());
                IOUtils.closeQuietly(in);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(in);
        }
    }

    private static synchronized ConfigProp getInstance() {
        if (instance == null)
            instance = new ConfigProp();
        return instance;
    }

    public static String getProps(String propKey) {
        return (String) getInstance().data.get(propKey);
    }
}
