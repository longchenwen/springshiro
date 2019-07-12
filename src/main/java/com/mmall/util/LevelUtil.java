package com.mmall.util;

import org.apache.commons.lang3.StringUtils;

/**
 * 计算level层级 0.1.2 是哪个层级的是0 还是1 或者是2 这些层级
 */
public class LevelUtil {

    public final static String SEPARATOR = ".";

    public final static String ROOT = "0";

    // 0
    // 0.1
    // 0.1.2
    // 0.1.3
    // 0.4
    public static String calculateLevel(String parentLevel, int parentId) {
        if (StringUtils.isBlank(parentLevel)) {
            return ROOT;
        } else {
            //拼接成当前要添加的部门的层级 例如:父层级是0.1
            return StringUtils.join(parentLevel, SEPARATOR, parentId);
        }
    }
}
