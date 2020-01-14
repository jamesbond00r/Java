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
    }
}
