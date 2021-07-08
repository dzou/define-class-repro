package com.example;

import java.lang.reflect.Method;
import java.security.ProtectionDomain;

public class Driver {

  public static void main(String[] args) throws Exception {
    Class loader = Class.forName("java.lang.ClassLoader");
    Method defineClass = loader.getDeclaredMethod("defineClass",
        new Class[]{ String.class,
            byte[].class,
            Integer.TYPE,
            Integer.TYPE,
            ProtectionDomain.class });
    defineClass.setAccessible(true);

    System.out.println("Success: ");
    System.out.println(defineClass.getName());
  }
}
