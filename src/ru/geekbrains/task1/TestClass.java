package ru.geekbrains.task1;

public class TestClass
{
    @BeforSuite
    public void beforST1()
    {
        System.out.println("Befor");
    }

    @Test(priority = 9)
    public void myTest1()
    {
        System.out.println("My test1 ");
    }

    @Test(priority = 4)
    public void myTest2()
    {
        System.out.println("My test2 ");
    }

    @Test(priority = 2)
    public void myTest3()
    {
        System.out.println("My test3 ");
    }

    @Test(priority = 10)
    public void myTest4()
    {
        System.out.println("My test4 ");
    }

    @AfterSuite
    public void afterST1()
    {
        System.out.println("After ");
    }

    @Test(priority = 4)
    public void myTest5()
    {
        System.out.println("My test5 ");
    }

    public void myTest6()
    {
        System.out.println("My test6 ");
    }

    public void myTest7()
    {
        System.out.println("My test7 ");
    }
//    @AfterSuite
//    public void afterST2()
//    {
//        System.out.println("After ");
//    }
//    @BeforSuite
//    public void beforST2()
//    {
//        System.out.println("Befor");
//    }
}
