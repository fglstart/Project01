package com.atguigu.java;

import java.util.ArrayList;

/**
 * @author shkstart
 * @date 2018/7/13 0013 - 下午 1:21
 * <p>
 * 1. IDEA中代码模板所处的位置：settings - Editor - Live Templates / Postfix Completion
 * 2. 常用的模板
 */
public class TemplatesTest {


    //模板六： prsf：可生成 private static final
    //private static final Customer CUST = new Customer();

    //变形：psf:   public static final
    public static final int NUM = 1;
    //变形：psfi:  public static final int
    public static final int NUM2 = 2;
    //变形：psfs:  public static final String
    public static final String NATION = "china";


    //模板一：psvm  (或者main,已经自定义好了)
    public static void main(String[] args) {


        //模板二：sout
        System.out.println("hello!");
        //变形：soutp / soutm / soutv / xxx.sout

        //soutp :parameter  参数  打印方法的形参
        System.out.println("args = [" + args + "]");

        //soutm :method  方法  打印方法
        System.out.println("TemplatesTest.main");

        int num1 = 10;
        //soutv
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);

        //num1.sout
        System.out.println(num1);

        //模板三：fori
        String[] arr = new String[]{"Tom", "Jerry", "HanMeimei", "Lilei"};
        //arr.fori
        for (int i = 0; i < arr.length; i++) {
            //arr[i].sout
            System.out.println(arr[i]);

        }
        //变形：iter   增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar   普通for循环
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }

        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        //list.for
        for (Object o : list) {

        }

        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //变形：list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }

    public void method() {
        System.out.println("TemplatesTest.method");

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        //模板五：ifn
        if (list == null) {

        }
        //变形:inn
        if (list != null) {

        }

        //变形：xxx.nn /  xxx.null
        //list.null
        if (list == null) {

        }
        //list.nn
        if (list != null) {

        }

    }


//    自定义模板 test+enter
    public void testUpdate(){
        //修改的测试
    }

//    pric+enter
    /**
     * 客户id
     */
    private int id;

//    prsc+enter
    /**
     * 客户姓名
     */
    private String name;



}
