package test;

import java.util.Scanner;

public class AreaHex {
    public static void areaHex() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Give a int for side: ");
        int s = keyboard.nextInt();
        double areaHex = (6*Math.pow(s, 2.0))/(4*Math.tan(Math.PI/6));
        System.out.println(areaHex);
        keyboard.close();
    }
    for (int i =0; i < 2; i++)
}

