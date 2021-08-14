package com.dht;

/**
 * @project_name: lambda-study
 * @package_name: com.dht
 * @description: 测试类
 * @author: DingHaiTing
 * @create_time: 2021-08-14 12:04
 **/
public class Test {

    interface Printer {
        void printer(String val);
    }

    public void printerSomething(String something, Printer printer) {
        printer.printer(something);
    }

    public static void main(String[] args) {
        Test test = new Test();

        /*test.printerSomething("test ", new Printer() {
            @Override
            public void printer(String val) {
                System.out.println(val);
            }
        });*/
        // lambda 表达式 简化匿名实现类
      /*  Printer printer = (String var) -> {
            System.out.println(var);
        };*/

        // lambda 表达式 简化匿名实现类
      /*  Printer printer = (var) -> {
            System.out.println(var);
        };*/

        // lambda 表达式 简化匿名实现类
        Printer printer = var -> System.out.println(var);


        test.printerSomething("test", printer);
    }

}


