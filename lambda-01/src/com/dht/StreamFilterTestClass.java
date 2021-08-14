package com.dht;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @project_name: lambda-study
 * @package_name: com.dht
 * @description: stream中的filter
 * @author: DingHaiTing
 * @create_time: 2021-08-14 22:19
 **/
public class StreamFilterTestClass {
    public static void main(String[] args) {
        Employee employee0 = new Employee(1, 24,"男", "ding", "haiting");
        Employee employee1 = new Employee(2, 24,"男", "ding", "haiting");
        Employee employee2 = new Employee(13, 24,"男", "ding", "haiting");
        Employee employee3 = new Employee(14, 26,"女", "ding", "haiting");
        Employee employee4 = new Employee(15, 22,"男", "ding", "haiting");
        Employee employee5 = new Employee(17, 2,"女", "ding", "haiting");
        Employee employee6 = new Employee(12, 24,"男", "ding", "haiting");
        Employee employee7 = new Employee(14, 49,"男", "ding", "haiting");
        Employee employee8 = new Employee(15, 50,"女", "ding", "haiting");
        Employee employee9 = new Employee(15, 290,"男", "ding", "haiting");

        List<Employee> employeeStream = Arrays.asList(employee0, employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9);

        /*List<Employee> collect = employeeStream.stream()
                .filter(temp -> temp.getAge() > 20 && temp.getGender().equals("女"))
                .collect(Collectors.toList());*/


        List<Employee> collect = employeeStream.stream()
                .filter(Employee.ageGreaterThan70.and(Employee.GenderM))
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
