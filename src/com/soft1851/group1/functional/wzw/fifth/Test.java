package com.soft1851.group1.functional.wzw.fifth;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author zw_w
 * @Description
 * @Date 2020/2/23 11.50
 */
public class Test{
    public static void main(String[] args) {
        /**
         * 这个直接是利用Comparator的排序了,sorted里面不知道怎么搞
         * 取第五个最长的单词目前只会用for循环
         */
        Sort sort = () -> {
            List<String> words =new ArrayList<>();
            words.add("English");
            words.add("Liu");
            words.add("love");
            words.add("Mr Wei");
            words.add("Chinese");
            words.add("Mrs ");
            List<Tem> result = new ArrayList<>();
            words.forEach(words1->result.add(new Tem(words1)));
            List<Tem> result1 = result.stream().sorted(Comparator.comparing(Tem::getString1).reversed()).collect(Collectors.toList());
            result1.forEach(e-> System.out.print(e.getString()+" "));

        };
        sort.sort();
    }


//    static List<String> getList(int size){
//        String str="abcdefghijklmnopqrstuvwxyz";
//        List<String> list = new ArrayList<>();
//        Random random=new Random();
//        for (int i=0;i<size;i++){
//            StringBuffer sb=new StringBuffer();
//            for (int j=0;j<random.nextInt(11)+2;j++){
//                sb.append(str.charAt(random.nextInt(26)));
//            }
//            list.add(sb.toString());
//        }
//        return list;
//    }

}
