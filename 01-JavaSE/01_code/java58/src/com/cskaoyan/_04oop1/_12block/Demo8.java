package com.cskaoyan._04oop1._12block;

/**
 * 看一下，代码块的执行顺序
 * @author Common-zhou
 * @since 2024-03-07 16:30
 */
public class Demo8 {
    static {
        System.out.println("main方法静态代码块！");
    }

    {
        System.out.println("main方法构造代码块！");
    }

    public static void main(String[] args) {
        System.out.println("main方法开始执行！");
        Star s = new Star(18, "马化腾");
        System.out.println(Star.name);
        System.out.println(s.age);
    }
}

class Star {
    {age = 18;Star.name = "杨超越";System.out.println("我喜欢杨超越");}
    static String name = "王菲";
    int age = 28;

    static {name = "杨幂";System.out.println("我喜欢杨幂");}
    public Star(int age, String name) {
        this(age);
        System.out.println("age,name：构造器！");
        Star.name = name;
        Star.name = "刘亦菲";
    }
    public Star(int age) {
        System.out.println("age：构造器！");
        this.age = age;
    }
    public Star() {
    }
}
