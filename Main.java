package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	int myMinValue = Integer.MIN_VALUE;
	int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Mini Value = " + myMinValue);
        System.out.println("Integer Max Value =  " + myMaxValue);
        System.out.println(myMinValue + myMaxValue);
        System.out.println("Busted max = " + (myMaxValue + 2));
        System.out.println("Busted Min = " + (myMinValue -1));

             byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Max Value =  " + myMaxByteValue);
        System.out.println("Byte Min Value = " + myMinByteValue);

        short myMinshortValue = Short.MIN_VALUE;
        short myMaxshortValue = Short.MAX_VALUE;
        System.out.println("short Max Value =  " + myMaxshortValue);
        System.out.println("short Min Value = " + myMinshortValue);

        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;
        System.out.println("long Max Value =  " + myMaxlongValue);
        System.out.println("long Min Value = " + myMinlongValue);
    long myLongValue = 100L;
    }
}
