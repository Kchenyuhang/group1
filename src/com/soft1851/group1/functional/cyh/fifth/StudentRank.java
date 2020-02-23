package com.soft1851.group1.functional.cyh.fifth;

import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/2/23
 */
@FunctionalInterface
public interface StudentRank {
    /**
     * 对学生进行排序
     * @param list list
     * @return
     */
    List<String> sortStudent(List<String> list);
}
