package com.bridzelabz;

public class RollTheDice {
    public static void main(String[] args) {
        System.out.println("Snack And Ladder");
        int die1;
        int die2;
        int roll;
        die1=(int)Math.floor(Math.random()*10)%6+1;
        die2=(int)Math.floor(Math.random()*10)%6+1;
        roll = die1+die2;
        System.out.println("First die "+die1);
        System.out.println("Second die "+die2);
        System.out.println("After rolling "+roll);
    }
}
