package com.soft1851.group1.functional.cyh.fifth;

import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/2/23
 */
@FunctionalInterface
public interface MaxLengthSteam {
    /**
     * 获取字段最长的单词
     * @param list list
     * @return
     */
    List<String> getMaxLengthWords(List<String> list);
}
