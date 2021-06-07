package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

//    public static String[] removeNull(String[] a) {
//        ArrayList<String> removedNull = new ArrayList<String>();
//        for (String str : a)
//            if (str != null)
//                removedNull.add(str);
//        return removedNull.toArray(new String[0]);
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PointStorage pointStorage = new PointStorage();

        final int POINT_COUNTER = 10;

        FigureReader reader = new FigureReader(scanner);
        Circle circle = reader.readCircle();


        for (int i = 0; i < POINT_COUNTER; i++) {
            System.out.printf("Enter the %d point \n", i + 1);
            Point p = reader.readPoint();
            if (circle.containsPoint(p)) {
                pointStorage.add(new PointStorage(p));



            }
        }

    }
}

