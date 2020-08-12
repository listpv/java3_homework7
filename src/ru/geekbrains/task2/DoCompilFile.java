package ru.geekbrains.task2;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class DoCompilFile
{
    public static void makeCompil() throws MalformedURLException, ClassNotFoundException,
            IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException
    {
        Class ch = URLClassLoader.newInstance(new URL[]{new File("C:/java/homework1/out/production/homework1")
                .toURL()}).loadClass("ru.geekbrains.homework1.Practic2");

        Object practice = ch.newInstance();

//        Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
//        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        Method method = ch.getDeclaredMethod("method8", int.class);
        method.invoke(practice, 1624);

//        Написать метод, которому в качестве параметра передается целое число,
//        метод должен вернуть true, если число отрицательное;
        method = ch.getDeclaredMethod("method6", int.class);
        System.out.println(method.invoke(practice, 6));

//        Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//        где a, b, c, d – входные параметры этого метода;
        method = ch.getDeclaredMethod("method3", float.class, float.class, float.class, float.class);
        System.out.println(method.invoke(practice,3, 5, 113, 11));

//        Написать метод, которому в качестве параметра передается строка, обозначающая имя,
//        метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        method = ch.getDeclaredMethod("method7", String.class);
        method.invoke(practice, "Ivan");

    }
}
