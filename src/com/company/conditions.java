package com.company;

import java.io.PrintStream;

public class conditions {
    public static void main(String[] args) {
        //Условия - ты ставишь условия
        //< - знак меньше
        //> - знак больше
        //<= - знак меньше или равно
        // >= - знак больше или равно
        //== - знак равенство
        //!= - знак неравенство
        //Условия

        int myInt = 30;


        if (myInt < 10){ // false   -услоовие
            ((PrintStream) null).println("меньше 10");
        }

        else if (myInt< 20){  // false
            ((PrintStream) null).println("меньше 20");
        }

        else{
            ((PrintStream) null).println("больше 20");
        }


    }
}
