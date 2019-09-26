package com.lickingheights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// todo declare variables a, b, c,discriminate, axisOFtsymmetry, patrabloaFacing, x and y
     double  a,b,c,descriminate,axisoftsymmetry,x,y;
     String parabloafacing;
     double dicriminate;
     Scanner radar;
   // todo initialize ammanuly
        radar = new Scanner(System.in);
        System.out.println("give me an A");
        a=radar.nextInt();
        System.out.println("give me an B");
        b=radar.nextInt();
        System.out.println("give me an C");
        c=radar.nextInt();
    a=-5;
    b=-3;
    c=1;
   // todo do calculations
        axisoftsymmetry = -b/(2*a);
        dicriminate = (b*b)-4*(a*c);
         if (dicriminate >0){
            System.out.println("There is one real solutions");
    }
            else {
            System.out.println("There is No real solutions");
        }
   // todo print results
System.out.println("Axis of symmetry"+axisoftsymmetry);
System.out.println("discriminate;"+dicriminate );
   // todo not in code; check results

   // todo initialize scanner and redo initialize area

   // todo double check



















    }
}
