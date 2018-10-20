package com.luna.java;

import com.luna.bean.Customer;

import java.util.ArrayList;

/**
 * @author li
 * @date 2018-10-20-10:49
 */
public class TemplateTest {
    public static final int NUMER=1;
    public static final int NUM2=2;
    public static final String   NATION ="china";
   private static final Customer cust= new Customer();
    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");
        System.out.println("args = " + args);
        int  num1=10;
        System.out.println("num1 = " + num1);
        System.out.println(num1);
        System.out.println("tianxia");
        for (int i = 0; i < 100; i++) {
            
        }

        String[]  arr =new String[]{"TOm","jerry","dfd"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {
            
        }
        for (int i = 0; i < list.size(); i++) {
            
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        if (list == null) {

        }
        if (list == null) {

        }
        if (list != null) {
            
        }
        if (list != null) {

        }
        if (list == null) {

        }

    }


}
