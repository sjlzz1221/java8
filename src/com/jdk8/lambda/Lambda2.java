package com.jdk8.lambda;

/**
 * lambda 表达式只能引用标记了 final 的外层局部变量，这就是说不能在 lambda 内部修改定义在域外的局部变量，否则会编译错误。
 *
 *
 *
 */
public class Lambda2 {

    final static String salutation = "Hello! ";

    public static void main(String[] args) {
        GreetingService greetService1 = message ->
                System.out.println(salutation + message);
        greetService1.sayMessage("Cola");
    }

    interface GreetingService {
        void sayMessage(String message);
    }

}
