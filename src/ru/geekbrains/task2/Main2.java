package ru.geekbrains.task2;

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;

//          Написать программу для проверки ДЗ
//        (Проанализировать папку с компилированными классами и вызвать методы, проверить результат)

public class Main2
{
    public static void main(String[] args)
    {
        // write your code here
        try {
            DoCompilFile.makeCompil();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
