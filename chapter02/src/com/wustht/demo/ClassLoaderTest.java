package com.wustht.demo;

public class ClassLoaderTest {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2
        
        //获取其上层  扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);//sun.misc.Launcher$ExtClassLoader@1540e19d

        //继续获取上层  引导类加载器（获取不到 可以粗略理解为权限不够 使用C/C++编写的）
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);//null

        //对于用户自定义类的加载：默认使用的是系统类加载器来加载的
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //系统的核心类库，如：String  都是使用的引导类加载器来加载的（所以获取不到）
        ClassLoader stringClassLoader = String.class.getClassLoader();
        System.out.println(stringClassLoader);//null

    }
}
