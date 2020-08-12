package ru.geekbrains.task3;


//          Написать метод который позволял бы заполнить и вывести на консоль матрицу 4 на 4
//        (заполненую инкрементом числа, начиная с 1)
public class Main3
{
    public static void main(String[] args)
    {
        // write your code here

       arrayFourOnFour();
    }


    public static void arrayFourOnFour ()
    {
        int var = 0;
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                if(++var < 10)
                {
                    System.out.print(" " + var + " ");
                }
                else
                    {
                        System.out.print(var + " ");
                    }
            }
            System.out.print("\n");
        }
    }
}
