package ru.geekbrains.task1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MakeTest
{
    public static void doAllTest(Class cl) throws IllegalAccessException, InstantiationException, InvocationTargetException
    {

        Object object = cl.newInstance();
        Method[] methods = cl.getDeclaredMethods();
        int bfr = 0;
        int aft = 0;
        for(Method o : methods)
        {
            if(o.isAnnotationPresent(BeforSuite.class))
            {
                bfr++;
            }
            if(o.isAnnotationPresent(AfterSuite.class))
            {
                aft++;
            }
        }
        if(bfr > 1 || aft > 1)
        {
            throw new RuntimeException("Лишние аннотации.");
        }

        for(int i = 11; i >= 0; i--)
        {
            for(Method o : methods)
            {
                if(i == 11 && o.isAnnotationPresent(BeforSuite.class) )
                {
                    o.invoke(object);
                }
                else if (i == 0 && o.isAnnotationPresent(AfterSuite.class))
                {
                    o.invoke(object);
                }
                else if (o.isAnnotationPresent(Test.class) && i == o.getAnnotation(Test.class).priority())
                {
                    System.out.print("Priority " + o.getAnnotation(Test.class).priority() + " --- ");
                    o.invoke(object);
                }
            }
        }
    }

    public static void doAllTest(String className) throws IllegalAccessException,
            InvocationTargetException, InstantiationException
    {
        Class cls = null;
        try
        {
            cls = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        doAllTest(cls);
    }
}
