package com.rhein.demo;

import org.yaml.snakeyaml.Yaml;

/**
 * 用于调试和理解 Snakeyaml 序列化和反序列化过程。
 */
public class Demo1 {
    public static void main(String[] args) {
        User user = new User("zch", 18);

        Yaml yaml = new Yaml();
        String userData = yaml.dump(user);

        System.out.println(userData);

        yaml.load(userData);

    }
}
