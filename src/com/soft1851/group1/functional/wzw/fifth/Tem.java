package com.soft1851.group1.functional.wzw.fifth;

/**
 * @Author: zw_w
 * @Date: 2020/2/23 1:36
 * @Description:
 */
public class Tem implements Comparable<Tem>{
    private String string;

    public Tem(String string) {
        this.string = string;
    }

    public Tem() {
    }

    public String getString() {
        return string;
    }

    public int getString1(){
        return string.length();
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public int compareTo(Tem tem) {
        return string.compareTo(tem.getString());
    }
}
