package com.rhein.demo;

import org.yaml.snakeyaml.Yaml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用于查看列表和字典对象序列化的结果。
 */
public class Demo3 {

    public static void main(String[] args) {

        ArrayList<String> l = new ArrayList<>();
        l.add("aaaa");
        l.add("bbbb");
        Yaml yaml = new Yaml();
        String data1 = yaml.dump(l);
        System.out.println(data1);


        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        String data2 = yaml.dump(map);
        System.out.println(data2);
    }
}
