package com.dht;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @project_name: lambda-study
 * @package_name: com.dht
 * @description: LambdaDemo1测试1
 * @author: DingHaiTing
 * @create_time: 2021-08-14 22:00
 **/
public class LambdaDemo1 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("aveuivnei","enaivhaiuvn","seve","avaeef");

        List<String> collect = name.stream() // 将map集合转换成流
                .filter(temp -> temp.startsWith("a")) // 过滤以字母 ”a“ 开头的
                .map(String::toUpperCase) // 转换成大写
                .sorted() // 排序
                .collect(Collectors.toList());// 转换成 List集合
        System.out.println(collect);

        // 把所有字母转换成大写
       List<String> collect1 = name.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
