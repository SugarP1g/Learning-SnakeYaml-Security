package com.rhein.demo;

import org.yaml.snakeyaml.Yaml;

/**
 * 用于理解 loadAs 限制反序列化类类型的过程
 */
public class Demo2 {
    public static void main(String[] args) {
        User user = new User("zch", 18);
        Users users = new Users(user);
        Yaml yaml = new Yaml();
        String userData = yaml.dump(users);
        System.out.println(userData);
        // 报错。调用 User class 构造函数后，调用 setXx 函数失败，找到 user 变量的 setXx 函数
        // yaml.loadAs(userData, User.class);
        yaml.loadAs(userData, Users.class);

    }
}
